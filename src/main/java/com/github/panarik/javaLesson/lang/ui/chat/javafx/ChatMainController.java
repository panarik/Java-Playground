package com.github.panarik.javaLesson.lang.ui.chat.javafx;


import javafx.application.Platform;
import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ChatMainController {


    public TextArea chatArea;
    public ListView onLineUsers;
    public TextField inputField;
    public Button btnSendMessage;

    public void mockAction(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void showAbout(ActionEvent actionEvent) {
        //            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/scene_about.fxml"));
//            Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("About");
//            stage.setScene(new Scene(root1));
        stage.show();
    }

    public void showHelp(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("https://github.com/panarik/JavaLesson"));
    }

    public void sendMessage(ActionEvent actionEvent) {
        appendTextFromTF();
    }

    private void appendTextFromTF() {
        String message = inputField.getText();
        if(message.isEmpty()) return;
        chatArea.appendText("Я: "+ message+System.lineSeparator());
        inputField.clear();
    }
}
