/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicJUnit;

/**
 *
 * @author Andre Matheus
 */
public class StudentForm {
    
    private int age;
    private String fName = "";
    private String lName = null;
    private String grade;
    private String[]possibleGrades = {"A","B","C","D","F"};
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String[] getPossibleGrades() {
        return possibleGrades;
    }
   
}
