/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import cit360.BasicCollections.*;


/**
 * This is a simple class just to call
 * @author Andre Matheus
 */
public class CallBasicCollections {
    public static void basicColectionsExamples(){
        System.out.println("------------Example of Set------------");
        AllStudents class101 = new AllStudents();
        class101.addStudent("James");
        class101.addStudent("John");
        class101.addStudent("Peter");
        System.out.println("Class students are: \n"+class101.getAllStudents());
        //You can notice that when the studend is already registered but is
        //added to the the set it doesn't affect the Set at all because sets
        //doesn't hold two equal elements.
        class101.addStudent("James");
        System.out.println("Class students are: \n"+class101.getAllStudents());

        System.out.println("");        
        System.out.println("------------Example of Map------------");
        ClassGrades class101G = new ClassGrades(class101);
        System.out.println(class101G.getClassGrades());
        //You can also notice HashMaps doesn't hold duplicated elements too.
        class101G.addStudent(class101, "John");        
        class101G.addStudent(class101, "Mary");
        class101G.addStudent(class101, "Clair");
        System.out.println("Students grades:");
        System.out.println(class101G.getClassGrades());
        
        System.out.println("");        
        System.out.println("-----------Example of Queue-----------");
        ClassQueue class101Q = new ClassQueue();
        class101Q.addStudent("James");
        class101Q.addStudent("Peter");
        class101Q.addStudent("Jonh");
        class101Q.addStudent("Peter");
        class101Q.addStudent("Mary");
        class101Q.emptyQueue();

        System.out.println("");
        System.out.println("-----------Example of Tree------------");
        ClassAttList class101T = new ClassAttList(class101);
        System.out.println(class101T.getAttList());
        class101T.addStudent(class101,"Jack");
        System.out.println(class101T.getAttList());
        class101T.addStudent(class101,"Bob");
        System.out.println(class101T.getAttList());
        
        System.out.println("");
        System.out.println("-----------Example of Array-----------");
        ClassGroups class101Gr = new ClassGroups(class101);
        class101Gr.formGroups();
        class101Gr.addStudent("Chrys");
        class101Gr.formGroups();
        class101Gr.switchStudent("Jack", "Peeta");
        class101Gr.switchStudent("Jack", "Peter");
        class101Gr.formGroups();
        class101Gr.insertStudentAt("Mary", 2);
        class101Gr.insertStudentAt("Mary", 0);
        class101Gr.insertStudentAt("Mary", 12);
        class101Gr.formGroups();
    }
}
