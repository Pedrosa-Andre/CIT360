/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import java.util.*;

/**
 * Here I am going to use an ArrayList to divide the class into groups. 
 * ArrayLists are useful because they have a specific order (different from 
 * Sets) and you can insert/remove elements in any point of the list (different 
 * from Queues) using indexes. Each element in the ArrayList has a natural 
 * index number (beginning from 0 until n-1 being 'n' the size on the list) that
 * represents its position on the list.
 * @author Andre Matheus
 */
public class ClassGroups {
    
    //The gropsList ArrayList will be filled with all the students names an then
    //the groups will be divided picking up 3 by 3 students.
    ArrayList<String> groupsList = new ArrayList<>();

    public ClassGroups() {
    }
    
    public ClassGroups(AllStudents cla) {
        importClass(cla);
    }
    
    /**
     * importClass method
     * Purpose: import the students from AllStudents hashSet to the 
     * ClassGroups class
     * Parameters: AllStudents (object)
     * Returs: none
     */
    private void importClass(AllStudents cla){
        for (String name : cla.getAllStudents()){
            groupsList.add(name);
        }
    }
    
    /**
     * addStudent method
     * Purpose: Add a new student both to the AllStudents object and ClassGroups
     * Parameters: AllStudents (object), student name (String)
     * Returs: none
     */
    public void addStudent(String name){
        // ArrayLists, different from Maps and Sets, accept duplicated elements.
        // They can coexist in an ArrayList because they are stored on specific 
        // places (or positions) represented by their index. So equal values/
        // objects/elements can be placed in different indexes on the list.
        if(groupsList.contains(name)){
            System.out.println(name + " is already on the list");
        }else{
            groupsList.add(name);
        }
    }
    
    /**
     * switchStudent method
     * Purpose: swith the position of two students already in the group
     * Parameters: student A name (String), student B name (String),
     * Returs: none
     */
    public void switchStudent(String nameA, String nameB){
        // check if both students are already in the class
        if(groupsList.contains(nameA) && groupsList.contains(nameB)){
            // This is one of the best functionalities of Lists, the ability
            // to place items at specific places. Here I track the index of each
            // student and then use the index to access the element and change
            // its value (in this case the name of the student).
            int a = groupsList.indexOf(nameA);
            int b = groupsList.indexOf(nameB);
            groupsList.set(a, nameB);
            groupsList.set(b, nameA);
        }else{
            // say if any of the are not in the class
            if(!groupsList.contains(nameA)){
                System.out.println(nameA + " is not in the class");
            }
            if(!groupsList.contains(nameB)){
                System.out.println(nameB + " is not in the class");
            }
        }
    }
    
    /**
     * insertStudentAt method
     * Purpose: place a student at a specific place in the list
     * Parameters: student name (String), position (int)
     * Returs: none
     */
    public void insertStudentAt(String name, int pos){
        if(pos <= 0){
            System.out.println("You can't place a student at this position");
        }else if(pos >= groupsList.size()){
            System.out.println("The list is too short to place the student there");
        }else{
            groupsList.remove(name);
            // As Lists are 0 indexed (begin with 0) and we usualy start conting 
            // with 1 the "-1" here turns the "human" counting position into 
            // "machine" counting position.
            groupsList.add(pos-1,name);
        }
    }

    /**
     * formGroups method
     * Purpose: list the students divided by groups of 3 or 2
     * Parameters: none
     * Returs: none
     */
    public void formGroups(){
        int group = 1;
        // This is an example of how to iterate and separate elements on an
        // ArrayList by their index.
        for(int i=0;i<groupsList.size();i=i+3){
            int remain = groupsList.size()-i;
            switch(remain){
                case 4:
                    System.out.println("Group " + group);
                    System.out.println(groupsList.get(i));
                    System.out.println(groupsList.get(i+1));
                    group++;
                    System.out.println("Group " + group);
                    System.out.println(groupsList.get(i+2));
                    System.out.println(groupsList.get(i+3));
                    i++;
                    break;
                case 2:
                    System.out.println("Group " + group);
                    System.out.println(groupsList.get(i));
                    System.out.println(groupsList.get(i+1));
                    break;
                default:
                    System.out.println("Group " + group);
                    System.out.println(groupsList.get(i));
                    System.out.println(groupsList.get(i+1));
                    System.out.println(groupsList.get(i+2));
                    group++;
                    break;
            }
        }
        System.out.println("");
    }
    
    public ArrayList<String> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(ArrayList<String> groupsList) {
        this.groupsList = groupsList;
    }
    
}
