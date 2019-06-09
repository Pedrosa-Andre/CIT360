/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicMVC;
import cit360.BasicMVC.AllStudentsModel;
import java.util.Set;

/**
 * Control Layer: This layer is responsible for the communication between the 
 * View and Model layers. It can receive requests and return information to the
 * View layer as well as request and receive data from the Model layer, 
 * processing the information among the two.
 * @author Andre Matheus
 */
public class AllStudentsControl {
    

    
    public static String addName(String name){
        String capName = name.substring(0, 1).toUpperCase() + 
                name.substring(1, name.length()).toLowerCase();
        //Call .getAllStudents() fom View layer to check if the student's name 
        //is already in the class.
        if (AllStudentsModel.getAllStudents().contains(capName)){
            //Return a String to the View layer (notice it could simply print it
            //to the console, but it's a View layer function).
            return capName + " is already in the class";
        } else {
            //Call the .addStudent() method form Model layer (responsible for 
            //adding names to the allStudents set).
            AllStudentsModel.addStudent(capName);
            //Return a string to the View Layer.
            return capName + " added to the class";
        }
    }
    
    public static Set showClass(){
        return AllStudentsModel.getAllStudents();
    }

}
