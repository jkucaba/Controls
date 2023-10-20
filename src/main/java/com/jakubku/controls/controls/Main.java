package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
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
    Label userSelection;

    @Override
    public void init() {
        userSelection = new Label("Your Selection: None");
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        RadioButton spring = new RadioButton("Spring");
        RadioButton summer = new RadioButton("Summer");
        RadioButton fall = new RadioButton("Fall");
        RadioButton winter = new RadioButton("Winter");
        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(spring, summer, fall, winter);
        group.selectedToggleProperty().addListener(this::changed);
        root.getChildren().addAll(userSelection, spring, summer, fall, winter);
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("RadioButton Control Example");
        stage.setScene(scene);
        stage.show();
    }
    public void changed(ObservableValue<? extends Toggle> observableValue, Toggle oldBtn, Toggle newBtn){
        String selectedLabel = "None";
        if(newBtn != null){
            selectedLabel = ((Labeled)newBtn).getText();
        }
        userSelection.setText("Your Selection: " + selectedLabel);
    }
    public static void main(String[] args) {
        launch();
    }
}
