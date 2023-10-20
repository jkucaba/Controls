package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
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
        BorderPane root = new BorderPane();
        HBox linksLayout = new HBox();
        linksLayout.setAlignment(Pos.CENTER);
        Hyperlink link1 = new Hyperlink("Google");
        Hyperlink link2 = new Hyperlink("YouTube");
        //WebView lets you open web page in app
        WebView webView = new WebView();
        link1.setOnAction(actionEvent -> webView.getEngine().load("https://www.google.com"));
        link2.setOnAction(actionEvent -> webView.getEngine().load("https://www.youtube.com"));
        linksLayout.getChildren().addAll(link1, link2);
        root.setTop(linksLayout);
        root.setCenter(webView);
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("HyperLink Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
