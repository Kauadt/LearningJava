package javaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExemploGridPane extends Application {

    public void start(Stage stage) {
        Label lblName = new Label("Nome:");
        Label lblEmail = new Label("E-mail:");

        TextField txtName = new TextField();
        TextField txtEmail = new TextField();

        Button btnEnviar = new Button("Enviar");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(8);
        gridPane.setVgap(8);
        gridPane.setPadding(new Insets(5));

        gridPane.addRow(0, lblName, txtName);
        gridPane.addRow(1, lblEmail, txtEmail);
        gridPane.addRow(2, btnEnviar);

        Scene scene = new Scene(gridPane, 400, 200);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}