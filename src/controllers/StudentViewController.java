package controllers;
/*
Description: controller class to control the view of our show on stage or our apllicatoin on GUI.
Author: Akshit Deswal
Date: 10 March 2021, 9:40 PM EST
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import static javafx.scene.control.SelectionMode.MULTIPLE;


public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private ListView<String> interestList;

    @FXML
    private ImageView imageView;

    private Student student;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ArrayList<String> unchartedInterests = new ArrayList<>();

        unchartedInterests.addAll(Arrays.asList("dancing","sports","music", "gaming"));

        student = new Student("Akshit","Deswal", 200454399, unchartedInterests);
        //set the first name label
        firstNameLabel.setText(student.getFirstName());
        //set last name label.
        lastNameLabel.setText(student.getLastName());
        //student number label.
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        // interest list is set here.
        ObservableList<String> interests = FXCollections.observableArrayList(student.getInterest());
        interestList.setItems(interests);
        //set the image of the student.
        imageView.setImage(student.getImage());
    }

}
