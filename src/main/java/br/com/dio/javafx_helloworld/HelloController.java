package br.com.dio.javafx_helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField name;
    @FXML
    private Label welcomeText;
    @FXML
    private Label seuNome;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onQueroVerButtonClick(ActionEvent actionEvent) {
        if (name.getText().isEmpty()) {
            seuNome.setText("Você nao viu o campo para digitar o nome??");
            System.out.println(actionEvent.getEventType().getSuperType().getName());
            System.out.println(actionEvent.getEventType().getName());
        } else {
            seuNome.setText("Agora te mostro " + name.getText());
        }
    }
}