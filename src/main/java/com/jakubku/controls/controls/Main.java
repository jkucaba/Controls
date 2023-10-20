package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        Slider slider = new Slider(0, 100, 20);
        slider.setShowTickMarks(true);
        slider.setBlockIncrement(10);
        root.getChildren().addAll(slider);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("Slider Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
