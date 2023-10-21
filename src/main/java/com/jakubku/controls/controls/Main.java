package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label selected = new Label();
        Button selectFirst = new Button("Select First");
        ListView<String> list = new ListView<>();
        ObservableList<String> names = FXCollections.observableArrayList("Patrick", "Sam", "Ken", "Sara");
        list.getSelectionModel()
                .selectedItemProperty()
                        .addListener(
                                (observableValue, olVal, newVal) ->
                                        selected.setText(newVal)
                                );
        //we can select multiple things
        //list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.getItems().addAll(names);
        selectFirst.setOnAction(actionEvent -> list.getSelectionModel().selectFirst());
        root.getChildren().addAll(selected, list, selectFirst);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("ListView Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
