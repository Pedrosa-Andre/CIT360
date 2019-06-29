/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

import java.util.ArrayList;

/**
 *
 * @author Andre Matheus
 */
public class HandlerGetStudent implements Handler{

    @Override
    public void handleIt(Object data) {
        // Get the data with the name and store to a String
        String fName = (String)data;
        // Copy the studentsList from ClassStudents
        ArrayList list = ClassStudents.getStudentList();
        boolean hasStu = false;
        // Iterate through the students list comparing the given name with the
        // Students first name
        for(int i = 0; i<list.size();i++){
            Student stu = (Student)list.get(i); 
            // If find the student print its info
            if(fName.equals(stu.getFirstName())){
                System.out.println("Name: "+stu.getFirstName()+" "+stu.getLastName());
                System.out.println("Grade: "+stu.getGrade());
                hasStu = true;
            }
        }
        if(!hasStu){
            System.out.println("There isn't any student with this name");
        }
    }

}
