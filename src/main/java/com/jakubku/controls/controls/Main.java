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
    Label answer;
    CheckBox checkBox;

    @Override
    public void init(){
        answer = new Label("Your answer: None");
        checkBox = new CheckBox("Choice");
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label question = new Label("Are you in favor?");
        //Indeterminate state
        checkBox.setAllowIndeterminate(true);
        checkBox.selectedProperty().addListener(this::changed);
        checkBox.indeterminateProperty().addListener(this::changed);
        root.getChildren().addAll(answer, question, checkBox);
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("CheckBox Control Example");
        stage.setScene(scene);
        stage.show();
    }
    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldVal, Boolean newVal){
        String choice = null;
        if(checkBox.isIndeterminate()) {
            choice = "Neutral";
        } else if (checkBox.isSelected()){
            choice = "Agree";
        } else {
            choice = "Negative";
        }
        answer.setText("Your answer: " + choice);
    }
    public static void main(String[] args) {
        launch();
    }
}
