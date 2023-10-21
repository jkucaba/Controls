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
        TreeView<String> treeView = new TreeView<>();
        TreeItem<String> classes = new TreeItem<>("Classes");
        TreeItem<String> classOne = new TreeItem<>("Class One");
        classOne.getChildren().addAll(
                new TreeItem<>("Patric"),
                new TreeItem<>("Sam"),
                new TreeItem<>("James"),
                new TreeItem<>("Sara")
        );
        TreeItem<String> classTwo = new TreeItem<>("Class Two");
        classTwo.getChildren().addAll(
                new TreeItem<>("Peter"),
                new TreeItem<>("Abigail"),
                new TreeItem<>("Rick")
        );
        classes.getChildren().addAll(classOne, classTwo);
        treeView.setRoot(classes);
        root.getChildren().addAll(treeView);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("TreeView Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
