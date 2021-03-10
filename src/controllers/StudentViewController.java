package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import models.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private ListView interestList;

    @FXML
    private ImageView imageView;

    private Student student;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> unchartedInterests = new ArrayList<>();
        unchartedInterests.addAll(Arrays.asList("dancing","sports","music"));
        student = new Student("Nida","Whatever", 200454398, unchartedInterests);
        System.out.println(student.getInterest());
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        imageView.setImage(student.getImage());

    }
}
