package CsAssistant.src;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Links extends BorderPane {
	public Links(Stage stage, Scene scene) {

		GridPane gp = new GridPane();

		Label links = new Label();
		Text text1 = new Text("useful links ");
		Text text2 = new Text("for a ");
		Text text3 = new Text("smarter and more efficient ");
		Text text4 = new Text("online experience");

		text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

		links.setGraphic(new HBox(text1, text2, text3, text4));
		text1.setStyle("-fx-fill: #960018;");
		text2.setStyle("-fx-fill: #FFFFFF;");
		text3.setStyle("-fx-fill: #960018;");
		text4.setStyle("-fx-fill: #FFFFFF;");

		Label l1 = new Label("CS Facebook page");
		ImageView faceView = new ImageView("facebookLogo.png");
		faceView.setFitHeight(70);
		faceView.setFitWidth(70);

		ColorAdjust colorFace = new ColorAdjust();
		colorFace.setHue(-0.9);
		colorFace.setBrightness(0.2);
		colorFace.setSaturation(0.7);

		faceView.setOnMouseEntered(event -> faceView.setEffect(colorFace));
		faceView.setOnMouseExited(event -> faceView.setEffect(null));

		faceView.setCursor(Cursor.HAND);

		faceView.setOnMouseClicked(event -> {
			try {

				Desktop.getDesktop().browse(new URI("https://www.facebook.com/CS.Club.bzu"));
			} catch (IOException | URISyntaxException e) {

				e.printStackTrace();
			}
		});

		gp.add(faceView, 0, 0);
		gp.add(l1, 1, 0);

		Label l2 = new Label("CS Instagram page");
		ImageView instaView = new ImageView("instaLogo.png");
		instaView.setFitHeight(70);
		instaView.setFitWidth(70);

		instaView.setCursor(Cursor.HAND);

		instaView.setOnMouseClicked(event -> {
			try {

				Desktop.getDesktop().browse(new URI("https://www.instagram.com/cs.club.bzu/"));
			} catch (IOException | URISyntaxException e) {

				e.printStackTrace();
			}
		});

		ColorAdjust instagramColors = new ColorAdjust();
		instagramColors.setContrast(0.2);
		instagramColors.setHue(0);
		instagramColors.setSaturation(0.5);
		instagramColors.setBrightness(0.3);

		instaView.setOnMouseEntered(event -> instaView.setEffect(instagramColors));
		instaView.setOnMouseExited(event -> instaView.setEffect(null));

		gp.add(instaView, 0, 1);
		gp.add(l2, 1, 1);

		Label l3 = new Label("BZU Station");
		ImageView webView = new ImageView("websiteIcon.png");
		webView.setFitHeight(70);
		webView.setFitWidth(70);

		webView.setCursor(Cursor.HAND);

		webView.setOnMouseClicked(event -> {
			try {

				Desktop.getDesktop().browse(new URI("https://www.bzu-station.me/"));
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		});

		ColorAdjust colorWeb = new ColorAdjust();
		colorWeb.setHue(0.7);
		colorWeb.setBrightness(0.2);
		colorWeb.setSaturation(0.5);

		webView.setOnMouseEntered(event -> webView.setEffect(colorWeb));
		webView.setOnMouseExited(event -> webView.setEffect(null));

		gp.add(webView, 0, 2);
		gp.add(l3, 1, 2);

		Label l4 = new Label("CS Technical Team");
		ImageView techView = new ImageView("messLogo.png");
		techView.setFitHeight(70);
		techView.setFitWidth(70);

		techView.setCursor(Cursor.HAND);

		techView.setOnMouseClicked(event -> {
			try {

				Desktop.getDesktop().browse(new URI("https://m.me/j/AbaFzaBf5-agc8f_//"));
			} catch (IOException | URISyntaxException e) {

				e.printStackTrace();
			}
		});

		ColorAdjust messengerColors = new ColorAdjust();
		messengerColors.setHue(-0.9);
		messengerColors.setSaturation(1);
		messengerColors.setBrightness(0);

		techView.setOnMouseEntered(event -> techView.setEffect(messengerColors));
		techView.setOnMouseExited(event -> techView.setEffect(null));

		gp.add(techView, 0, 3);
		gp.add(l4, 1, 3);

		Label l5 = new Label("CS Public Service Team");
		ImageView publicServiceView = new ImageView("messLogo.png");
		publicServiceView.setFitHeight(70);
		publicServiceView.setFitWidth(70);

		publicServiceView.setCursor(Cursor.HAND);

		publicServiceView.setOnMouseClicked(event -> {
			try {

				Desktop.getDesktop().browse(new URI("https://m.me/j/AbZMLz1mL-q-axuQ/"));
			} catch (IOException | URISyntaxException e) {

				e.printStackTrace();
			}
		});

		publicServiceView.setOnMouseEntered(event -> publicServiceView.setEffect(messengerColors));
		publicServiceView.setOnMouseExited(event -> publicServiceView.setEffect(null));

		gp.add(publicServiceView, 0, 4);
		gp.add(l5, 1, 4);

		gp.setAlignment(Pos.CENTER);
		gp.setVgap(10);
		gp.setHgap(15);

		VBox vBox = new VBox(30, links, gp);
		vBox.setAlignment(Pos.CENTER);

		setCenter(vBox);

		Button backBtn = new Button("Back");
		backBtn.setOnAction(e -> {
			stage.setScene(scene);

		});

		setTop(backBtn);
		setPadding(new Insets(30, 30, 30, 30));

	}
}
