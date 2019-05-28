/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;
import cit360.BasicCollections.*;

/**
 *
 * @author Andre Matheus
 */
public class CIT360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AllStudents class101 = new AllStudents();
        class101.addStudent("James");
        class101.addStudent("John");
        class101.addStudent("Peter");
        class101.addStudent("James");
        //You can notice that when the studend is already registered but is
        //added to the the set it doesn't affect the set at all because sets
        //doesn't hold two equal elements.
        System.out.println("Class students are: \n"+class101.getAllStudents());
        
        ClassGrades class101G = new ClassGrades(class101);
        System.out.println(class101G.getClassGrades());
    }
    
}
