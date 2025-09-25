package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploControles extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Olá, Mundo! Sou uma label");
        Button botao = new Button("Clique aqui");
        TextField campoTexto = new TextField();

        VBox layout = new VBox(label, botao, campoTexto);
        Scene scene = new Scene(layout, 500, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
