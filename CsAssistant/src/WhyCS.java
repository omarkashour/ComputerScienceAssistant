package CsAssistant.src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WhyCS extends BorderPane {

	public WhyCS(Stage stage, Scene scene) throws FileNotFoundException {
		Label message = new Label();
		Label whyCS = new Label();
		Text text1 = new Text("Why ");
		Text text2 = new Text("Computer Science ");
		Text text3 = new Text("?");

		whyCS.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		whyCS.setPadding(new Insets(15));
		message.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		message.setPadding(new Insets(15));

		text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

		whyCS.setGraphic(new HBox(text1, text2, text3));
		text1.setStyle("-fx-fill: #960018;");
		text2.setStyle("-fx-fill: #FFFFFF;");
		text3.setStyle("-fx-fill: #960018;");

		ArrayList<String> list = new ArrayList<>();
		BufferedReader objReader = null;
		try {
			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("why cs.txt"));

			while ((strCurrentLine = objReader.readLine()) != null) {

				list.add(strCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		Button backBtn = new Button("Back");
		backBtn.setOnAction(e -> {
			stage.setScene(scene);
			stage.centerOnScreen();

		});
		Random rand = new Random();

		Button updateBtn = new Button("Show another Message");
		updateBtn.setOnAction(e -> {
			message.setText(list.get(rand.nextInt(list.size())));
		});
		message.setText(list.get(rand.nextInt(list.size())));
		message.setFont(new Font("Times New Roman", 23));
		message.setWrapText(true);
		message.setMaxWidth(500);
		setCenter(message);

		HBox topScene = new HBox(320, backBtn, whyCS);
		topScene.setAlignment(Pos.CENTER_LEFT);
		setTop(topScene);
		setBottom(updateBtn);
		setAlignment(updateBtn, Pos.CENTER);
		setPadding(new Insets(15));

	}

}