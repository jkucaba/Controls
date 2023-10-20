package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Button button = new Button("Click me");
        Button other = new Button("Other");
        Rectangle rect = new Rectangle(20, 20, Color.CYAN);
        other.setGraphic(rect);
        root.getChildren().addAll(other, button);
        button.setCancelButton(true); //false by default
        button.setOnAction(actionEvent -> {
            System.out.println("Quiting Program");
            Platform.exit();
        });
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("Button Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
