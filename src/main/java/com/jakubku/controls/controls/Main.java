package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        TabPane pane = new TabPane();
        Tab one = new Tab("One");
        Tab two = new Tab("Two");
        pane.getTabs().addAll(one,two);
        root.setCenter(pane);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("TabPane Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
