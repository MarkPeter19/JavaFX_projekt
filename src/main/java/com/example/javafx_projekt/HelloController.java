package com.example.javafx_projekt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private static int counter;

    @FXML
    private Button pressedButton;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        pressedButton.setText("Pressed :" + counter++);
    }
}