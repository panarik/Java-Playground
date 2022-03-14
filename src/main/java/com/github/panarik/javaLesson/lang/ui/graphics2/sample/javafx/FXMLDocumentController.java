package com.github.panarik.javaLesson.lang.ui.graphics2.sample.javafx;


import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

public class FXMLDocumentController {

//    @FXML
    public Button button;
//    @FXML
    private Label label12;

//    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label12.setText("Hello World!");
        button.setScaleX(4.0);
        button.setScaleY(5.0);
        button.setText("BLAHBLAH!!!");
//        button.setBackground(new Background());
    }
    
}
