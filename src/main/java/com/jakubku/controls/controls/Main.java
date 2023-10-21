package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        ListView<Task> taskListView = new ListView<>();
        ObservableList<Task> task = FXCollections.observableArrayList(
                new Task("Create Java Project"),
                new Task("Create Bug Report"),
                new Task("Commit changes to repo")
        );
        //adding custom cell to list
        taskListView.setCellFactory(taskListView1 -> new CustomTaskCell());
        taskListView.getItems().addAll(task);
        root.getChildren().addAll(taskListView);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("ListView Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
