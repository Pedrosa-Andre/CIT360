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
        //Happy path - add 3 new studentsto the set
        AllStudents class101 = new AllStudents();
        class101.addStudent("James");
        class101.addStudent("John");
        class101.addStudent("Peter");
        //Result - writes the students names to the conslole
        
        //Nasty path - add a student that already exists
        System.out.println("Class students are: \n"+class101.getAllStudents());
        //You can notice that when the studend is already registered but is
        //added to the the set it doesn't affect the Set at all because sets
        //doesn't hold two equal elements.
        class101.addStudent("James");
        System.out.println("Class students are: \n"+class101.getAllStudents());
        //Result - writes a alert mensage and then writes the students names 
        //with no changes

        System.out.println("");        
        System.out.println("------------Example of Map------------");
        //Happy path - create a map and import students from class101 set
        ClassGrades class101G = new ClassGrades(class101);
        System.out.println(class101G.getClassGrades());
        //Result - prints a map with the students names and their grades
        
        //Nasty path - add a name that alrady exist in the map.
        //You can also notice HashMaps doesn't hold duplicated elements too.
        class101G.addStudent(class101, "John");
        System.out.println(class101G.getClassGrades());
        //Result - Prints an alert mensage to the console and don't change any 
        //name (the grade may change because of the random function I used)
        
        //Happy path - add more students to the map, one of them with grade A
        class101G.addStudent(class101, "Mary");
        class101G.addStudentGr(class101, "Clair","A");
        System.out.println("Students grades:");
        System.out.println(class101G.getClassGrades());
        //Result - Prints a map with all students names and their grades
        
        System.out.println("");        
        System.out.println("-----------Example of Queue-----------");
        //Happy path - create a ClassQueue() object and populate with students
        ClassQueue class101Q = new ClassQueue();
        class101Q.addStudent("James");
        class101Q.addStudent("Peter");
        class101Q.addStudent("Jonh");
        class101Q.addStudent("Mary");
        System.out.println(class101Q.getBrakeQueue());
        //Result - print a queue with the names in order of addition
        
        //Nasty path - add a student that is already on the queue
        class101Q.addStudent("Peter");
        System.out.println(class101Q.getBrakeQueue());
        //Result - prints an alert message and don't change the queue

        //Happy path - empty the queue using emptyQueue() method
        class101Q.emptyQueue();
        //Result - print the students in the order they entered the queue

        System.out.println("");
        System.out.println("-----------Example of Tree------------");
        //Happy path - Create a tree and import students from class101 set
        ClassAttList class101T = new ClassAttList(class101);
        System.out.println(class101T.getAttList());
        //Result - print a list with students names sorted in alphabetical order
        
        //Happy path - add two more names to the list
        class101T.addStudent(class101,"Jack");
        System.out.println(class101T.getAttList());
        class101T.addStudent(class101,"Bob");
        System.out.println(class101T.getAttList());
        //Result - print the list with all the names still in alphabetical order
        
        //Nasty path - add a name that already exists in the tree
        class101T.addStudent(class101,"Bob");
        System.out.println(class101T.getAttList());
        //Result - print an alert message and a list equal to previous list (as 
        //trees naturaly dosen't hold 2 equal values.
        
        System.out.println("");
        System.out.println("-----------Example of Array-----------");
        
        //Happy path - create an ArrayList and import names from class101 set 
        //and then use formGroups() method to separate them
        ClassGroups class101Gr = new ClassGroups(class101);
        class101Gr.formGroups();
        //Result - print a list with the students names separated in groups of
        //2 or 3 students
        
        //Happy path - add a new student to the array list and then separate the
        //groups
        class101Gr.addStudent("Chrys");
        class101Gr.formGroups();
        //Result - print a list with the students names separated in new groups 
        //of 2 or 3 students        

        //Nasty path - try to switch the position of two elements when one of 
        //them doesn't exist in the ArrayList
        class101Gr.switchStudent("Jack", "Peeta");
        //Result - Print an alert mensage
        
        //Happy path - switch two elements in the ArrayList
        class101Gr.switchStudent("Jack", "Peter");
        class101Gr.formGroups();
        //Result print a new list of groups where the two elements (students)
        //were switched
        
        //Nasty path - Try to replace a student in imposiple positions in the 
        //ArrayList (position <=0 or >ArrayList.size()) (remember the method
        //insertStudent() uses the human way to count (begining w/ 1))
        class101Gr.insertStudentAt("Mary", -5);//means ArrayList index -6 
        class101Gr.insertStudentAt("Mary", 0); //means ArrayList index -1
        class101Gr.insertStudentAt("Mary", 12);//means ArrayList index 11
        //Result - print three alert mensages
        
        //Happy path - Replace a student in a valid position using 
        //insertStudentAt() method
        class101Gr.insertStudentAt("Mary", 1); //1st position (ArrayList index 0)
        class101Gr.formGroups();
        //Result - print a new group list with Mary in the first place
    }
}
