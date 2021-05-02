package com.github.panarik.ui.chat.javafx;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    }

    public void showHelp(ActionEvent actionEvent) {


    }

    public void sendMessage(ActionEvent actionEvent) {
    }
}
