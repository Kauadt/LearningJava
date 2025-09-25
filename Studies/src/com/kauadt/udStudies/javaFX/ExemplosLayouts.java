package javaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemplosLayouts extends Application {

    @Override
    public void start(Stage stage) {
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");

        HBox hBox = new HBox(button1, button2);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(button3, button4);
        vBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(vBox);

        Scene scene = new Scene(borderPane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
