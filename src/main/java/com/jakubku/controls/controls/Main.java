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
    boolean isLightOn;

    @Override
    public void init() {
        isLightOn = false;
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Rectangle rect = new Rectangle(200, 100, Color.RED);
        ToggleButton light = new ToggleButton("OFF");
        root.getChildren().addAll(rect, light);
        light.setOnAction(actionEvent -> {
            isLightOn = !isLightOn;
            if(isLightOn){
                rect.setFill(Color.GREEN);
                light.setText("ON");
            } else {
                rect.setFill(Color.RED);
                light.setText("OFF");
            }
        });
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("ToggleButton Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
