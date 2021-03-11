package models;
/*
Description: Our student model class with five instance variables or functions of the Student Object
Author: Akshit Deswal
Date: 10 March 2021, 9:37 PM EST
 */
import javafx.scene.image.Image;

import java.util.ArrayList;


public class Student {
    //  Three private variables.
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interests;
    private Image image;

    /*
    The Constructor takes 4 argument two of String type, one integer type and one is ArrayList<String> type.
     */
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> interest){
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterest(interest);
        setImage();
    }
    //set method is used to set Image.
    private void setImage()
    {
        String filePath = String.format("images/%s_%d.jfif",firstName,studentNumber);
        this.image = new Image(filePath);
    }

    public Image getImage() {

        return image;
    }

    //    setter and getter for each variable.
    public void setFirstName(String firstName){
        if (firstName.length() >= 2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException(firstName+" is invalid please your First name should contain atleast 2 character ");
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        if(lastName.length() >= 2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException(lastName+" is invalid please your Last name should contain atleast 2 character");
    }
    public  String getLastName(){
        return lastName;
    }
    public void setStudentNumber(int studentNumber){
        if(studentNumber>100000000&&studentNumber<999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException(studentNumber+" is not valid, please type a correct nine digit number");
    }
    public int getStudentNumber(){
        return studentNumber;
    }

    /*
    Static method which returns an ArrayList of type String and returns the same type of data.
     */
    public static ArrayList<String> addActivities()
    {
        ArrayList<String> interests = new ArrayList<>();//new ArrayList or we can use List here.
        interests.add("hiking");//all the valid inputs.
        interests.add("skiing");
        interests.add("reading");
        interests.add("coding");
        interests.add("gaming");
        interests.add("music");
        interests.add("dancing");
        interests.add("sports");
        return interests;
    }

    public void setInterest(ArrayList<String> interests) {
        ArrayList<String> validInterest = addActivities();
        for (String interest : interests)//for loop is used to iterate the ArrayList.
        {
            if (!validInterest.contains(interest))//condition
                throw new IllegalArgumentException(interest + " is not valid.  please choose from these options: " +validInterest);
        }
        this.interests = interests;
    }
    public ArrayList<String> getInterest()
    {
        return interests;
    }


}