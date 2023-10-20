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
        root.setSpacing(10);
        Label label = new Label("Your Direction: ");

        ChoiceBox<String> directions = new ChoiceBox();
        ObservableList<String> directionList = FXCollections.observableArrayList("North", "South", "East", "West");
        directions.getItems().addAll(directionList);
        //Showing first option at start
        directions.getSelectionModel().selectFirst();
        //Adding an Event listener
        directions.getSelectionModel().selectedItemProperty()
                .addListener(observable->
                        label.setText(
                                "Your Direction: "
                                        + directions.getSelectionModel().getSelectedItem())
        );

        root.getChildren().addAll(label, directions);
        Scene scene = new Scene(root, 500, 450);
        stage.setTitle("ChoiceBox Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
