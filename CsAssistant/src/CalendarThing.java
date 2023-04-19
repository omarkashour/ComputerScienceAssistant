import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CalendarThing extends BorderPane {

	private YearMonth currentYearMonth;
	private BorderPane calendarLayout;
	private VBox eventLayout;
	private Label monthYearLabel;
	Label tasksThisMonth = new Label("Tasks this month: ");

	private List<Event> events = new ArrayList<>();

	public CalendarThing(Stage stage, Scene scene) {

		tasksThisMonth.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		currentYearMonth = YearMonth.now();
		calendarLayout = new BorderPane();
		HBox header = createHeader();
		calendarLayout.setTop(header);
		calendarLayout.setCenter(createCalendarGrid());
		calendarLayout.setMargin(header, new Insets(15));
		eventLayout = new VBox();
		eventLayout.setSpacing(10);
		eventLayout.setAlignment(Pos.TOP_CENTER);
		eventLayout.getChildren().add(tasksThisMonth);

		setRight(calendarLayout);
		setLeft(eventLayout);
		setPadding(new Insets(20));
		Button clearBtn = new Button("Clear tasks");
		Button backBtn = new Button("Back");
		backBtn.setOnAction(e -> {
			stage.setScene(scene);
			stage.centerOnScreen();
		});

		clearBtn.setOnAction(e -> {
			eventLayout.getChildren().clear();
			events.clear();
			eventLayout.getChildren().add(tasksThisMonth);
		});
		HBox buttons = new HBox(clearBtn, backBtn);
		buttons.setSpacing(15);
		setBottom(buttons);
		setAlignment(buttons, Pos.CENTER);
		setAlignment(calendarLayout, Pos.CENTER);
		setAlignment(eventLayout, Pos.CENTER);

	}

	private HBox createHeader() {
		monthYearLabel = new Label();
		monthYearLabel.setText(currentYearMonth.getMonth().toString() + " " + currentYearMonth.getYear());
		monthYearLabel.setFont(new Font("Times New Roman", 23));

		Button prevButton = new Button("<<");
		prevButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				currentYearMonth = currentYearMonth.minusMonths(1);
				updateCalendar();
			}
		});

		Button nextButton = new Button(">>");
		nextButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentYearMonth = currentYearMonth.plusMonths(1);
				updateCalendar();
			}
		});

		HBox headerLayout = new HBox();
		headerLayout.setSpacing(10);
		headerLayout.setAlignment(Pos.CENTER);
		headerLayout.getChildren().addAll(prevButton, monthYearLabel, nextButton);

		return headerLayout;
	}

	private GridPane createCalendarGrid() {
		GridPane calendarGrid = new GridPane();
		calendarGrid.setHgap(10);
		calendarGrid.setVgap(10);

		String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 0; i < daysOfWeek.length; i++) {
			Label dayOfWeekLabel = new Label(daysOfWeek[i]);
			dayOfWeekLabel.setFont(new Font("Times New Roman", 23));
			dayOfWeekLabel.setTextFill(Color.WHITE);
			dayOfWeekLabel.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, null, null)));
			dayOfWeekLabel.setPrefWidth(100);
			dayOfWeekLabel.setAlignment(Pos.CENTER);
			calendarGrid.add(dayOfWeekLabel, i, 0);
		}

		LocalDate startDate = currentYearMonth.atDay(1);
		LocalDate endDate = currentYearMonth.atEndOfMonth();
		int row = 1;
		int col = startDate.getDayOfWeek().getValue() % 7;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");

		for (int day = 1; day <= currentYearMonth.lengthOfMonth(); day++) {
			Label dayLabel = new Label(String.valueOf(day));
			ColorAdjust colorFace = new ColorAdjust();
			colorFace.setHue(0);
			colorFace.setBrightness(0);
			colorFace.setSaturation(1);
			dayLabel.setCursor(Cursor.HAND);
			dayLabel.setOnMouseEntered(event -> dayLabel.setEffect(colorFace));
			dayLabel.setOnMouseExited(event -> dayLabel.setEffect(null));
			dayLabel.setFont(new Font("Times New Roman", 23));
			dayLabel.setAlignment(Pos.CENTER);
			dayLabel.setPrefWidth(100);
			dayLabel.setPrefHeight(80);
			dayLabel.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, null, null)));
			dayLabel.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
				@Override
				public void handle(javafx.scene.input.MouseEvent event) {
					LocalDate date = currentYearMonth.atDay(Integer.parseInt(dayLabel.getText()));
					addEvent(date);
				}
			});

			if (startDate.isEqual(LocalDate.now())) {
				dayLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
			}

			calendarGrid.add(dayLabel, col, row);

			col++;
			if (col > 6) {
				col = 0;
				row++;
			}
		}

		return calendarGrid;
	}

	private void updateCalendar() {
		monthYearLabel.setText(currentYearMonth.getMonth().toString() + " " + currentYearMonth.getYear());
		calendarLayout.setCenter(createCalendarGrid());
		updateEventLayout();
	}

	private void addEvent(LocalDate date) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Add Event");
		dialog.setHeaderText("Add an event for " + date.format(DateTimeFormatter.ofPattern("EEEE, MMMM d")));
		dialog.setContentText("Event:");

		Optional<String> result = dialog.showAndWait();
		result.ifPresent(event -> {
			Event newEvent = new Event(date, event);
			events.add(newEvent);
			updateEventLayout();
		});
	}

	private void updateEventLayout() {
		eventLayout.getChildren().clear();
		eventLayout.getChildren().add(tasksThisMonth);
		for (Event event : events) {
			if (event.getDate().getYear() == currentYearMonth.getYear()
					&& event.getDate().getMonth() == currentYearMonth.getMonth()) {
				Label eventLabel = new Label(event.toString());
				eventLabel.setFont(new Font("Times New Roman", 23));
				eventLayout.getChildren().add(eventLabel);
			}
		}
	}

	private class Event {
		private LocalDate date;
		private String name;

		public Event(LocalDate date, String name) {
			this.date = date;
			this.name = name;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String toString() {
			return date.format(DateTimeFormatter.ofPattern("EEEE, MMMM d")) + ": " + name;
		}
	}
}
