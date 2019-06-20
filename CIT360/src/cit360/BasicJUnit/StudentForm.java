/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicJUnit;

import java.util.Scanner;

/**
 *
 * @author Andre Matheus
 */
public class StudentForm {
    
    private int age;
    private String fName;
    private String lName;
    private String[]bothNames = new String[2];
    private String grade;
    private String[]possibleGrades = {"A","B","C","D","F"};
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String[] getBothNames() {
        return bothNames;
    }

    public void setBothNames(String[] bothNames) {
        this.bothNames = bothNames;
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
