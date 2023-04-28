package CsAssistant.src;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Old extends BorderPane {
	public Old(Stage stage, Scene scene) throws IOException, InterruptedException {
		TextArea aiResponse = new TextArea();
		TextArea clientMessage = new TextArea();
		clientMessage.setFont(Font.font("Noto Sans",  17));
		aiResponse.setFont(Font.font("Noto Sans",  17));
		aiResponse.setEditable(false);
		clientMessage.setEditable(false);
		Image aiImage = new Image("AI.png");
		Image clientImage = new Image("user.png");
		ImageView aiView = new ImageView(aiImage);
		ImageView clientView = new ImageView(clientImage); 
		Label infoL = new Label("							       	Powered by GPT-3.5-Turbo");
		infoL.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		aiView.setFitHeight(100);
		aiView.setFitWidth(100);
		clientView.setFitHeight(100);
		clientView.setFitWidth(100);

		aiResponse.setPrefHeight(220);
		clientMessage.setPrefHeight(100);
		;
		aiResponse.setWrapText(true);
		clientMessage.setWrapText(true);

		HBox aiHbox = new HBox(aiView, aiResponse);
		HBox clientHbox = new HBox(clientMessage, clientView);
		aiHbox.setSpacing(15);
		clientHbox.setSpacing(15);

		TextArea inputPrompt = new TextArea();
		Button sendBtn = new Button("Send Prompt");
		HBox inputHbox = new HBox(inputPrompt, sendBtn);
		Button clearBtn = new Button("Clear Chat");

		inputPrompt.setPrefHeight(100);
		setBottom(inputHbox);
		setAlignment(inputHbox, Pos.CENTER);
		setPadding(new Insets(15));
		VBox chatVbox = new VBox();
		inputPrompt.setPromptText("Enter a prompt.");
		inputPrompt.setStyle("-fx-prompt-text-fill: gray;");
		sendBtn.setOnAction(e -> {
			chatVbox.getChildren().clear();
			if (!inputPrompt.getText().trim().equals("")) {
				chatVbox.getChildren().add(clientHbox);
				chatVbox.getChildren().add(aiHbox);
				clientHbox.setAlignment(Pos.CENTER);
				aiHbox.setAlignment(Pos.CENTER);
				clientMessage.setText(inputPrompt.getText().trim());
				inputPrompt.clear();
				try {
					aiResponse.setText(getResponse(clientMessage.getText()));
				} catch (Exception e1) {
					aiResponse.setText("BZU AI has encountered an error, try again later.");

				}
			}
		});

		clearBtn.setOnAction(e -> {
			chatVbox.getChildren().clear();
		});

		VBox controlsVbox = new VBox(sendBtn, clearBtn);
		controlsVbox.setSpacing(15);
		inputHbox.getChildren().add(controlsVbox);
		chatVbox.setSpacing(15);
		setCenter(chatVbox);
		setAlignment(chatVbox, Pos.CENTER);
		inputHbox.setAlignment(Pos.CENTER);
		inputHbox.setSpacing(15);
		Button backBtn = new Button("Back");
		HBox topBox = new HBox(backBtn,infoL);
		backBtn.setAlignment(Pos.TOP_LEFT);
		infoL.setAlignment(Pos.CENTER);
		topBox.setSpacing(15);
		backBtn.setOnAction(e -> {
			stage.setScene(scene);
			stage.centerOnScreen();
		});
		setTop(topBox);
		setMargin(chatVbox, new Insets(15));
	}

	private String getResponse(String prompt) throws IOException, InterruptedException {
		// ------------------------------------- API REQUEST AND RESPONSE
		// -----------------------------
		String url = "https://api.openai.com/v1/chat/completions";
		String apiKey = "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";

		String JSONmessage = "{\"model\":\"gpt-3.5-turbo\",\"messages\": [{\"role\": \"user\", \"content\": \"" + prompt
				+ "\"}],\"temperature\":0,\"max_tokens\":250,\"top_p\":1,\"frequency_penalty\":0.0,\"presence_penalty\":0.0}";
		// Create the HTTP request
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Authorization", "Bearer " + apiKey)
				.header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(JSONmessage))
				.build();

		// Send the HTTP request and get the response
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String reply = response.body();
		String messageStart = "\"content\":\"";
		String messageEnd = "\"},";

		int start = reply.indexOf(messageStart) + messageStart.length();
		int end = reply.indexOf(messageEnd, start);
		// -----------------------------------------------------------------------------------------------------------
		return reply.substring(start, end).replaceAll("\\n\\d+\\.", "");
	}

}