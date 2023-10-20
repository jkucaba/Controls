package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        MenuBar menu = new MenuBar();
        Menu file = new Menu("File");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(actionEvent -> Platform.exit());
        file.getItems().addAll(save, exit);
        Menu edit = new Menu("Edit");
        RadioMenuItem option = new RadioMenuItem("Options");
        RadioMenuItem settings = new RadioMenuItem("Settings");
        Menu prefs = new Menu("Preferences");
        MenuItem prefOne = new MenuItem("Pref:One");
        MenuItem prefTwo = new MenuItem("Pref:Two");
        edit.getItems().addAll(option, settings, new SeparatorMenuItem(), prefs);
        prefs.getItems().addAll(prefOne, prefTwo);
        menu.getMenus().addAll(file, edit);
        root.setTop(menu);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("Menu Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
