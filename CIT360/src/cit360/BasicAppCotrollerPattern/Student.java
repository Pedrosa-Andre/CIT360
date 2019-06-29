/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

import java.util.Random;

/**
 *
 * @author Andre Matheus
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private String grade;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = setRandomGrade();
    }
    
    private String setRandomGrade(){
        Random ran = new Random();
        int gradeN = ran.nextInt(5);
        String[] allGrades = {"A","B","C","D","F"};
        String gradeL = allGrades[gradeN];
        return gradeL;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getGrade() {
        return grade;
    }

}
