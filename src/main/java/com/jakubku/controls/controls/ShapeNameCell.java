package com.jakubku.controls.controls;

import javafx.scene.control.ListCell;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class ShapeNameCell extends ListCell<String> {
    @Override
    public void updateItem(String item, boolean empty){
        super.updateItem(item, empty);
        if(empty){
            setText(null);
            setGraphic(null);
        } else {
            setText(item);
            Shape shape = this.getShape(item);
            setGraphic(shape);
        }
    }
    public Shape getShape(String name){
        Shape shape = null;
        switch (name.toLowerCase()) {
            case "patrick" -> shape = new Line(0, 10, 20, 10);
            case "sam" -> shape = new Rectangle(0, 0, 20, 20);
            case "ken" -> shape = new Circle(20, 20, 10);
            default -> {}
        };
        return shape;
    }
}
