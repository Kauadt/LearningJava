package javaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploLista extends Application {

    @Override
    public void start(Stage stage) {
        ObservableList<String> itens = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");

        ListView<String> listView = new ListView<>(itens);

        VBox layout = new VBox(listView);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
