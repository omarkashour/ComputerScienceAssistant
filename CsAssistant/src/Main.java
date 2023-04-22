import java.net.HttpURLConnection;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	boolean themeSwitcher = true;

	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();

		Button DevelopersBtn = new Button("Developers");
		bp.setTop(DevelopersBtn);

		Label welcomeLabel = new Label("Welcome to your");
		welcomeLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		Label csaLabel = new Label("Computer Science Assistant");

		csaLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));

		ImageView logoView = new ImageView("logo2.png");
		logoView.setFitHeight(289.5);
		logoView.setFitWidth(422.5);

		logoView.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {

			Glow glow = new Glow();
			glow.setLevel(1.0);
			ColorAdjust colorAdjust = new ColorAdjust();
			colorAdjust.setBrightness(0.3);
			colorAdjust.setContrast(0.3);
			colorAdjust.setSaturation(0.3);
			colorAdjust.setHue(-0.05);
			glow.setInput(colorAdjust);
			logoView.setEffect(glow);
		});

		logoView.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			logoView.setEffect(null);
		});

		VBox vBox = new VBox(10, welcomeLabel, logoView, csaLabel);
		vBox.setAlignment(Pos.CENTER);
		bp.setCenter(vBox);
		Button whyCSBtn = new Button("Why CS?");
		Button calBtn = new Button("Calendar");
		Button gpaBtn = new Button("GPA Calculator");
		Button planBtn = new Button("Major Plan");
		Button assistantBtn = new Button("Ai Assistant");
		Button linksBtn = new Button("Useful Links");

		HBox mainOptionsHbox = new HBox(7, calBtn, gpaBtn, planBtn, assistantBtn, linksBtn);
		mainOptionsHbox.setAlignment(Pos.CENTER);
		VBox optionsVbox = new VBox(7, whyCSBtn, mainOptionsHbox);

		optionsVbox.setAlignment(Pos.CENTER);
		bp.setBottom(optionsVbox);

		Scene scene = new Scene(bp, 1200, 700);
		Links linksBP = new Links(stage, scene);
		Scene linkScene = new Scene(linksBP, 1200, 700);

		linksBtn.setOnAction(e -> {
			linkScene.getStylesheets().add("DarkMode.css");
			stage.setScene(linkScene);
			stage.centerOnScreen();

		});

		GPACalculator gpa = new GPACalculator(stage, scene);
		Scene gpaScene = new Scene(gpa, 1200, 700);

		gpaBtn.setOnAction(e -> {
			gpaScene.getStylesheets().add("DarkMode.css");
			stage.setScene(gpaScene);
			stage.centerOnScreen();

		});

		CalendarThing cal = new CalendarThing(stage, scene);
		Scene calScene = new Scene(cal, 1200, 700);
		calBtn.setOnAction(e -> {
			calScene.getStylesheets().add("DarkMode.css");
			stage.setScene(calScene);
			stage.centerOnScreen();

		});

		bp.setPadding(new Insets(15, 15, 15, 15));

		WhyCS why = new WhyCS(stage, scene);
		Scene whyScene = new Scene(why, 1200, 700);
		whyCSBtn.setOnAction(e -> {
			whyScene.getStylesheets().add("DarkMode.css");
			stage.setScene(whyScene);
			stage.centerOnScreen();

		});
		Developers devTeam = new Developers(stage, scene);
		Scene devScene = new Scene(devTeam, 1200, 700);
		DevelopersBtn.setOnAction(e -> {
			devScene.getStylesheets().add("DarkMode.css");
			stage.setScene(devScene);
			stage.centerOnScreen();

		});

		Plan planBP = new Plan(stage, scene);
		Scene planScene = new Scene(planBP, 1550, 700);

		planBtn.setOnAction(e -> {
			planScene.getStylesheets().add("DarkMode.css");
			stage.setScene(planScene);
			stage.centerOnScreen();
		});

		AiAssistant aiBP = new AiAssistant(stage, scene);
		Scene aiScene = new Scene(aiBP, 1200, 700);
		assistantBtn.setOnAction(e -> {
			aiScene.getStylesheets().add("DarkMode.css");
			stage.setScene(aiScene);
			stage.centerOnScreen();
		});
		scene.getStylesheets().add("DarkMode.css");
		stage.setScene(scene);
		stage.setTitle("Computer Science Assistant");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
