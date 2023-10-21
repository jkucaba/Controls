package com.jakubku.controls.controls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class UserUtility {
    public static ObservableList<User> getUsersList(){
        return FXCollections.observableArrayList(
                new User("John", "Johnson", LocalDate.of(1997, 10,1)),
                new User("Ken", "Block", LocalDate.of(2002, 1,6)),
                new User("Sara", "Barney", LocalDate.of(1987, 3,7))
        );
    }
    public static TableColumn<User, String> getFirstNameColumn(){
        TableColumn<User, String> fNameCol = new TableColumn<>("First Name");
        fNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        fNameCol.setSortable(false);
        return fNameCol;
    }
    public static TableColumn<User, String> getLastNameColumn(){
        TableColumn<User, String> lNameCol = new TableColumn<>("Last Name");
        lNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        return lNameCol;
    }
    public static TableColumn<User, LocalDate> getBirthDateColumn(){
        TableColumn<User, LocalDate> bDateCol = new TableColumn<>("Birth Date");
        bDateCol.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        return bDateCol;
    }
}
