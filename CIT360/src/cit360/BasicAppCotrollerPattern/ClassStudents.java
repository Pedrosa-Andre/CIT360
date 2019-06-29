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
public class ClassStudents {
    
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    public static void addStudent(Student stu){
        studentList.add(stu);
    }
    
    public static void setStudentList(ArrayList<Student> studentList) {
        studentList = studentList;
    }

}
