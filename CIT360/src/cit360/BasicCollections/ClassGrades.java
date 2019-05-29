/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import java.util.*;
import cit360.BasicCollections.*;


/**
 * This class is an example of a map being used to store student grades.
 * I used a map in this case because maps allow us to store pairs of key-values.
 * It means I can store a student's name with theyr grade in the same line.
 * @author Andre Matheus
 */
public class ClassGrades {

    private Map<String,String> classGrades = new HashMap<String,String>();

    public ClassGrades() {
    }

    public ClassGrades(AllStudents cla) {
        importClass(cla);
    }
    
    /**
     * importClass method
     * Purpose: import the students from AllStudents hashSet to the ClassGrades
     * class and add random grades to them
     * Parameters: AllStudents (object)
     * Returs: none
     */
    private void importClass(AllStudents cla){
        for (String name : cla.getAllStudents()){
            String gra = randomGrade();
            classGrades.put(name, gra);
        }
    };
    
    
    /**
     * addStudent method
     * Purpose: Add a new student both to the AllStudents objetc and ClassGrades
     * with a random grade.
     * Parameters: AllStudents (object), student name (String)
     * Returs: none
     */
    public void addStudent(AllStudents cla, String name){
        cla.addStudent(name);
        String gra = randomGrade();
        //Another important observation about the HashMap class is that it
        //doesn't hold two elements with the same key (similar to the Set class)
        //So, when you add (.put()) an element to a HashMap, if the key of the
        //element already exist in the HashMap only the value of this element in
        //the HashMap will be updated.
        classGrades.put(name, gra);
    };

    
    
    /**
     * addStudentGr method
     * Purpose: Add a new student with theyr grade both to the AllStudents 
     * objetc and ClassGrades.
     * Parameters: AllStudents (object), student name (String), student grade 
     * (String)
     * Returs: none
     */
    public void addStudentGr (AllStudents cla, String name, String gra){
        cla.addStudent(name);
        classGrades.put(name, gra);
    };
    
    /**
     * randomGrade method
     * Purpose: generate a random letter grade
     * Parameters: none
     * Returs: letter grade
     */
    private String randomGrade(){
        Random ran = new Random();
        int gradeN = ran.nextInt(5);
        String gradeL = "";
        switch(gradeN){
            case 0:
                gradeL = "A";
                break;
            case 1:
                gradeL = "B";
                break;
            case 2:
                gradeL = "C";
                break;
            case 3:
                gradeL = "D";
                break;
            case 4:
                gradeL = "F";
                break;
        }
        return gradeL;
    }
            
            
    public Map<String, String> getClassGrades() {
        return classGrades;
    }

    public void setClassGrades(Map<String, String> classGrades) {
        this.classGrades = classGrades;
    }
    
}
