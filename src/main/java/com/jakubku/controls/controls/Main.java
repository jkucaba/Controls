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
        Label label = new Label("Your selection is: ");
        ToggleButton spring = new ToggleButton("Spring");
        ToggleButton summer = new ToggleButton("Summer");
        ToggleButton fall = new ToggleButton("Fall");
        ToggleButton winter = new ToggleButton("Winter");
        ToggleGroup seasons = new ToggleGroup();
        seasons.getToggles().addAll(spring, summer, fall, winter);
        HBox seasonsLayout = new HBox();
        seasonsLayout.setAlignment(Pos.CENTER);
        seasonsLayout.setSpacing(5);
        seasonsLayout.getChildren().addAll(spring, summer, fall, winter);
        root.getChildren().addAll(label, seasonsLayout);
        //t1 -> selected toggle
        seasons.selectedToggleProperty().addListener((observableValue, toggle, t1) ->{
            label.setText("Your selection is: " + ((Labeled)t1).getText());
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
