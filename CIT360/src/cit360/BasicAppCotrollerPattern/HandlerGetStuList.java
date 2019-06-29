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
public class HandlerGetStuList implements Handler {

    @Override
    public void handleIt(Object data) {
        //Copy the studentsList from ClassStudents
        ArrayList list = ClassStudents.getStudentList();
        System.out.println("The students in the class are:");
        // Iterate through it printing the Students infos
        for(int i = 0; i<list.size();i++){
            Student stu = (Student)list.get(i);
            int index = i+1;
            System.out.println(index+" "+stu.getFirstName()+" "+stu.getLastName());
        }
    }

}
