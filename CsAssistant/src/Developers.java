import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Developers extends BorderPane {

	public Developers(Stage stage, Scene scene) {
		ImageView abdullah = new ImageView("Abdullah.png");
		abdullah.setFitHeight(280);
		abdullah.setFitWidth(280);
		Circle borderAMJ = new Circle(abdullah.getFitWidth() / 2 + 5);
		borderAMJ.setFill(Color.WHITE);

		StackPane abdullahSP = new StackPane();
		abdullahSP.getChildren().addAll(borderAMJ, abdullah);

		ScaleTransition scaleTransitionAMJ = new ScaleTransition(Duration.seconds(0.2), abdullah);
		scaleTransitionAMJ.setToX(0.9);
		scaleTransitionAMJ.setToY(0.9);

		ColorAdjust colorFace = new ColorAdjust();
		colorFace.setHue(0);
		colorFace.setBrightness(0.1);
		colorFace.setSaturation(0.8);

		borderAMJ.setOnMouseEntered(event -> borderAMJ.setEffect(colorFace));
		borderAMJ.setOnMouseExited(event -> borderAMJ.setEffect(null));

		Label abdullahInfo1 = new Label();
		Text text1 = new Text("Abdullah Abduljalil ");
		Text text2 = new Text("second year");

		text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		abdullahInfo1.setGraphic(new HBox(text1, text2));
		text2.setStyle("-fx-fill: #960018;");
		text1.setStyle("-fx-fill: #FFFFFF;");

		Label abdullahInfo2 = new Label("\"Computer Science student || Interested in Full Stack Development\"");
		abdullahInfo2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
		abdullahInfo2.setStyle("-fx-text-fill: #FFFFFF;");

		VBox vBox1 = new VBox(10, abdullahInfo1, abdullahInfo2);
		vBox1.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		vBox1.setPadding(new Insets(15));

		setMargin(vBox1, new Insets(250, 25, 250, 25));

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5), vBox1);
		translateTransition.setFromY(-200);
		translateTransition.setToY(0);

		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.5), new KeyValue(vBox1.opacityProperty(), 1)));

		abdullah.setOnMouseEntered(event -> {
			setCenter(vBox1);

			translateTransition.play();
			timeline.play();

			borderAMJ.setEffect(colorFace);
			scaleTransitionAMJ.play();
		});

		abdullah.setOnMouseExited(event -> {
			getChildren().remove(vBox1);
			translateTransition.stop();
			timeline.stop();
			vBox1.setOpacity(0);

			abdullah.setEffect(null);
			borderAMJ.setEffect(null);
			scaleTransitionAMJ.stop();
			abdullah.setScaleX(1.0);
			abdullah.setScaleY(1.0);
		});

		ImageView omar = new ImageView("Omar.png");
		omar.setFitHeight(280);
		omar.setFitWidth(280);
		Circle borderOK = new Circle(omar.getFitWidth() / 2 + 5);
		borderOK.setFill(Color.WHITE);

		StackPane omarSP = new StackPane();
		omarSP.getChildren().addAll(borderOK, omar);

		ScaleTransition scaleTransitionOmar = new ScaleTransition(Duration.seconds(0.2), omar);
		scaleTransitionOmar.setToX(0.9);
		scaleTransitionOmar.setToY(0.9);

		ColorAdjust colorFaceOK = new ColorAdjust();
		colorFaceOK.setHue(0);
		colorFaceOK.setBrightness(0.1); 
		colorFaceOK.setSaturation(0.8);
		borderOK.setOnMouseEntered(event -> borderOK.setEffect(colorFace));
		borderOK.setOnMouseExited(event -> borderOK.setEffect(null));

		Label omarInfo1 = new Label();
		Text omartext1 = new Text("Omar Kashour ");
		Text omartext2 = new Text("second year");

		omartext1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		omartext2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		omarInfo1.setGraphic(new HBox(omartext1, omartext2));
		omartext2.setStyle("-fx-fill: #960018;");
		omartext1.setStyle("-fx-fill: #FFFFFF;");

		Label omarInfo2 = new Label("\"Computer Science student || Interested in Artificial Intelligence\"");
		omarInfo2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
		omarInfo2.setStyle("-fx-text-fill: #FFFFFF;");

		VBox omarvBox1 = new VBox(10, omarInfo1, omarInfo2);
		omarvBox1.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		omarvBox1.setPadding(new Insets(15));

		setMargin(omarvBox1, new Insets(250, 25, 250, 25));

		TranslateTransition omartranslateTransition = new TranslateTransition(Duration.seconds(0.5), omarvBox1);
		omartranslateTransition.setFromY(-200);
		omartranslateTransition.setToY(0);

		Timeline omartimeline = new Timeline(
				new KeyFrame(Duration.seconds(0.5), new KeyValue(omarvBox1.opacityProperty(), 1)));

	
		omar.setOnMouseEntered(event -> {
			setCenter(omarvBox1);

			omartranslateTransition.play();
			omartimeline.play();

			borderOK.setEffect(colorFaceOK);
			scaleTransitionOmar.play();
		});

		omar.setOnMouseExited(event -> {
			getChildren().remove(omarvBox1);
			omartranslateTransition.stop();
			omartimeline.stop();
			omarvBox1.setOpacity(0);

			borderOK.setEffect(null);
			omar.setEffect(null);
			scaleTransitionOmar.stop();
			omar.setScaleX(1.0);
			omar.setScaleY(1.0);
		});

		VBox vBox = new VBox(10, abdullahSP, omarSP);
		vBox.setAlignment(Pos.CENTER);

		setLeft(abdullahSP);
		setRight(omarSP);

		Text text = new Text();
		text.setFont(Font.font("Verdana", FontWeight.BOLD, 41));
		text.setFill(Color.RED);
		text.setStroke(Color.BLACK);
		text.setStrokeWidth(2);
		text.setEffect(new DropShadow(10, Color.BLACK));
		setEffect(new Reflection());
		Button backBtn = new Button("Back");
		backBtn.setOnAction(e -> {
			stage.setScene(scene);
			stage.centerOnScreen();
		});
		setTop(backBtn);
		setPadding(new Insets(15));

	}

}
