package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        ComboBox<String> names = new ComboBox<>();
        names.getItems().addAll("Patrick", "Sam", "Ken");
        names.setCellFactory(stringListView -> new ShapeNameCell());
        names.setButtonCell(new ShapeNameCell());
        root.getChildren().addAll(names);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("ComboBox Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
