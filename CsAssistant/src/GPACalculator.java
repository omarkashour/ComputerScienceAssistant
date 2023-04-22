import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GPACalculator extends VBox {
	GridPane gp = new GridPane();
	HBox infoHbox = new HBox();
	int n = 0;

	public GPACalculator(Stage stage, Scene scene) {
		Label numberOfCoursesL = new Label("Number of courses: ");
		numberOfCoursesL.setFont(new Font("Times New Roman", 23));
		TextField numberOfCoursesTF = new TextField();
		Button enterBtn = new Button("Enter");
		infoHbox.setAlignment(Pos.CENTER);
		infoHbox.setSpacing(15);
		infoHbox.getChildren().addAll(numberOfCoursesL, numberOfCoursesTF, enterBtn);
		Button backBtn = new Button("Back");
		backBtn.setOnAction(e -> {
			stage.setScene(scene);

		});
		Button calculateBtn = new Button("Calculate Average");
		Label gpaL = new Label("");
		gpaL.setFont(new Font("Times New Roman", 23));
		infoHbox.getChildren().add(backBtn);
		getChildren().add(infoHbox);
		Label maxL = new Label("");
		maxL.setFont(new Font("Times New Roman", 23));
		infoHbox.getChildren().add(maxL);
		enterBtn.setOnAction(e -> {
			gpaL.setText("");
			gp.getChildren().clear();
			maxL.setFont(new Font("New Times Roman", 17));
			try {
				n = Integer.parseInt(numberOfCoursesTF.getText());
				if (n > 8) {
					n = 8;
					maxL.setText("Maximum is 8 courses in one semester");
				} else {
					maxL.setText("");
				}
				for (int i = 0; i < n; i++) {
					Label subjectGradeL = new Label("Subject Grade:");
					subjectGradeL.setFont(new Font("Times New Roman", 23));
					TextField subjectGradeTF = new TextField();
					Label hoursL = new Label("Hours:");
					hoursL.setFont(new Font("Times New Roman", 23));
					TextField hoursTF = new TextField();
					hoursTF.setPrefWidth(40);
					gp.add(subjectGradeL, 0, i);
					gp.add(subjectGradeTF, 1, i);
					gp.add(hoursL, 2, i);
					gp.add(hoursTF, 3, i);
				}
				gp.add(calculateBtn, 0, n + 1);
				gp.add(gpaL, 1, n + 1);
			} catch (Exception t) {

			}

		});

		boolean valid = true;
		calculateBtn.setOnAction(e -> {
			double totalGradePoints = 0.0;
			double totalCreditHours = 0.0;
			for (Node node : gp.getChildren()) {
				if (node instanceof TextField) {
					TextField textField = (TextField) node;
					int colIndex = GridPane.getColumnIndex(textField);
					int rowIndex = GridPane.getRowIndex(textField);
					if (colIndex == 1) { // Grade column
						try {
							double grade = Double.parseDouble(textField.getText().trim());
							int creditHours = Integer.parseInt(
									((TextField) gp.getChildren().get(colIndex + 2 + (rowIndex * 4))).getText().trim());
							double points = (grade * creditHours);
							if (grade > 99) {
								grade = 99;
							} else if (grade < 55) {
								grade = 55;
							}
							totalGradePoints += points;
							totalCreditHours += creditHours;
						} catch (Exception ex) {
							gpaL.setText("Invalid numbers");
						}
					}
				}
			}
			if (totalCreditHours > 0) {
				double gpa = totalGradePoints / (double) totalCreditHours;
				gpaL.setText(String.format("Your average is %.2f", gpa));
			} else {
				gpaL.setText("Invalid numbers");
			}
		});
		gp.setVgap(15);
		gp.setHgap(15);
		gp.setPadding(new Insets(20));
		getChildren().add(gp);
		setPadding(new Insets(15));
	}

}
