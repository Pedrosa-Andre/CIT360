/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import java.util.*;

/**
 * I was about to use an ArrayList class to create an attendance list, but as it
 * has to be alphabetically (re)sorted for each new student in the school class
 * it's more advantageous to use a treeSet once it's always (re)sorted in each 
 * insertion (I saw this tip on satckoverflow). So I'm creating this three
 * @author Andre Matheus
 */
public class AttTreeList {
    
    //The TreeSet by default always sort the elements in a natural order 
    //(Strings -> alphabetical; Numbers -> crescent; etc) but if you whant a 
    //different behavior in the comparisson (decressent, letter "c" first or 
    //whatever) you can create a comparator and place in on the TreeSet
    //constructor like TreeSet<type>(comparator);
    private Collection<String> attList = new TreeSet<String>();

    public AttTreeList() {
    }

    /**
     * importClass method
     * Purpose: import the students from AllStudents hashSet to the 
     * AttendanceList class
     * Parameters: AllStudents (object)
     * Returs: none
     */
    public void importClass(AllStudents cla){
        for (String name : cla.getAllStudents()){
            attList.add(name);
        }
    };
    
    /**
     * addStudent method
     * Purpose: Add a new student both to the AllStudents object and AttTreeList
     * Parameters: AllStudents (object), student name (String)
     * Returs: none
     */
    public void addStudent(AllStudents cla, String name){
        cla.addStudent(name);
        //The TreeSet class doesn't hold two equal elements (similar to the Set 
        //and Map classes) so when you add an element to a TreeSet that already 
        //exists on it the TreeSet won't change.
        attList.add(name);
    };

    public Collection<String> getAttList() {
        return attList;
    }

    public void setAttList(Collection<String> attList) {
        this.attList = attList;
    }
    
    
    
}
