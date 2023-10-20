package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        ComboBox<HBox> names = new ComboBox<>();
        names.getItems().addAll(
                new HBox(
                        new Line(0, 10, 20, 10),
                        new Label("Patrick")
                ),
                new HBox(
                        new Rectangle(0, 0, 20, 20),
                        new Label("Sam")
                ),
                new HBox(
                        new Circle(20, 20, 10),
                        new Label("Ken")
                )
        );
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
