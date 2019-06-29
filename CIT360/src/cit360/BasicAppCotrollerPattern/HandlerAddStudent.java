/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

import java.util.HashMap;

/**
 *
 * @author Andre Matheus
 */
public class HandlerAddStudent implements Handler{

    @Override
    public void handleIt(Object data) {
        // Get the hashmap with the two names
        HashMap<String,String> map = (HashMap)data;
        // Store then in two different Strings
        String fName = map.get("fName");
        String lName = map.get("lName");
        // Create a Student object with the given names
        Student stu = new Student(fName,lName);
        // Add the student to the ClassStudents studentList
        ClassStudents.addStudent(stu);
        System.out.println(fName+" "+lName+" added!");
    }

}
