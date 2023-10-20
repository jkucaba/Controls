package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        MenuButton Sites = new MenuButton("Sites");
        MenuItem google = new MenuItem("Google");
        MenuItem youtube = new MenuItem("Youtube");
        google.setOnAction(actionEvent -> System.out.println("Visiting Google.com"));
        youtube.setOnAction(actionEvent -> System.out.println("Visiting YouTube.com"));
        Sites.getItems().addAll(google, youtube); //like getChildren()
        root.getChildren().addAll(Sites);
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("MenuButton Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
