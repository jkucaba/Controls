package com.jakubku.controls.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        TreeView<String> treeView = new TreeView<>();
        TreeItem<String> classes = new TreeItem<>("Classes");
        TreeItem<String> classOne = new TreeItem<>("Class One");
        //classOne.setExpanded(true);
        classOne.getChildren().addAll(
                new TreeItem<>("Patric"),
                new TreeItem<>("Sam"),
                new TreeItem<>("James"),
                new TreeItem<>("Sara")
        );
        TreeItem<String> classTwo = new TreeItem<>("Class Two");
        //classTwo.setExpanded(true);
        classTwo.getChildren().addAll(
                new TreeItem<>("Peter"),
                new TreeItem<>("Abigail"),
                new TreeItem<>("Rick")
        );
        classTwo.addEventHandler(TreeItem.branchExpandedEvent(), e ->
                System.out.println(e.getTreeItem().getValue()));
        classes.getChildren().addAll(classOne, classTwo);
        treeView.setRoot(classes);
        treeView.setShowRoot(false); // We see classes and not root
        treeView.setCellFactory(TextFieldTreeCell.forTreeView());
        treeView.setEditable(true);
        /*treeView.setCellFactory(tCell -> {
            TreeCell<String> cell = new TreeCell<>(){
                @Override
                public void updateItem(String item, boolean empty){
                    super.updateItem(item, empty);
                    setText(null);
                    setGraphic(null);
                    if(!empty){
                        if(this.getTreeItem().getValue() == "Patric"){
                            setText(item);
                            setGraphic(new Rectangle(15,15, Color.RED));
                        } else {
                            setText(item);
                            setGraphic(new Rectangle(15,15, Color.VIOLET));
                        }
                    }
                }
            };
            return cell;
        });*/
        treeView.setOnEditCommit(e ->
                e.getTreeItem().setValue(e.getNewValue())
                );;
        root.getChildren().addAll(treeView);
        Scene scene = new Scene(root, 500, 450);
        root.requestFocus();
        stage.setTitle("TreeView Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
