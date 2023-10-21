package com.jakubku.controls.controls;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Task {
    private final StringProperty task;
    public Task(String task) {
        this.task = new SimpleStringProperty(this, "task", task);
    }

    public String getTask() {
        return task.get();
    }

    public StringProperty taskProperty() {
        return task;
    }

    @Override
    public String toString() {
        return this.task.get();
    }
}
