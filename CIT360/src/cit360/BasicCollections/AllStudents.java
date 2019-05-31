/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import java.util.*;

/**
 * This clas is just a simple set of all students of a class.
 * I used a set collection because as a class can not have two or
 * more of the same student, so this collection is useful to avoid
 * dobled registers.
 * 
 * @author Andre Matheus
 */
public class AllStudents {
    
    private Set<String> allStudents = new HashSet<String>();

    public AllStudents() {
    }
    
    /**
    * addStudent method
    * Purpose: add students to the set pointing out the repeated ones
    * Parameters: String with student's name
    * Returns: none
    */
    public void addStudent(String student){
        //this point out when a student is already on the set
        if (allStudents.contains(student)){
            System.out.print( student + " is already registered in class ");
        };
        allStudents.add(student);
        //You can notice that when the studend is already registered but is
        //added to the the set it doesn't affect the set at all because sets
        //doesn't hold two equal elements.
        System.out.println(student + " added!");
    };

    public Set<String> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Set<String> allStudents) {
        this.allStudents = allStudents;
    }
    
    

}
