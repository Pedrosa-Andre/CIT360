/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicMVC;
import java.util.*;

/**
 * Model layer: Responsible for holding the data. The classes in this layer hold
 * the objects that store the data. Its methods are related to the insertion and
 * return of information (setters and getters, or special "filtering" methods).
 * An example of a possible filtering method for this class is a method for the 
 * allStudents names Set witch prevents names with numbers to be inserted on it. 
 * @author Andre Matheus
 */
public class AllStudentsModel {
    
    private static Set<String> allStudents = new HashSet<String>();

    public AllStudentsModel() {
    }
    
    //A simple method to add an element to the set.
    public static void addStudent(String student){
        allStudents.add(student);
    }
    
    //Simply the setter an getter to the data of this class.
    public static Set<String> getAllStudents() {
        return allStudents;
    }
    public static void setAllStudents(Set<String> _allStudents) {
        allStudents = _allStudents;
    }

}
