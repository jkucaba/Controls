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
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        Label label = new Label("Name Selected: ");
        ComboBox<String> names = new ComboBox<>();
        names.setPromptText("Select a name");
        //only in combobox
        names.setEditable(true);
        ObservableList<String> namesList =
                FXCollections.observableArrayList("Patrick", "Sam", "Ken", "Sara");
        names.getItems().addAll(namesList);
        names.getSelectionModel()
                .selectedItemProperty()
                .addListener(
                        o ->
                                label.setText(
                                        "Name Selected: " +
                                        names.getSelectionModel()
                                                .getSelectedItem())
                );
        root.getChildren().addAll(label, names);
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
