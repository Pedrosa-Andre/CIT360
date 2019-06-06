/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicJSON;
import cit360.BasicCollections.*;
import com.google.gson.*;
import java.util.HashMap;

/** 
 * This class is an example of how to work with JSON in Java using a specific
 * library. I extended ClassGrades class and adapted it to store its HashMap
 * on a serialized JSON representation.
 * @author Andre Matheus
 */
public class ClassGradesJson extends ClassGrades{
    
    private Gson gsonObj = new Gson();
    private String classGradesJ;

    public ClassGradesJson() {
    }

    public ClassGradesJson(AllStudents cla) {
        importClass(cla);
    }
    
    /**
     * importClass method
     * Purpose: import the students from AllStudents HashSet to the ClassGrades
     * HashMap and add random grades to them, and then store it in a serialized
     * JSON String.
     * @param cla (AllStudents object)
     */
    @Override
    protected void importClass(AllStudents cla){
        for (String name : cla.getAllStudents()){
            String gra = randomGrade();
            classGrades.put(name, gra);
        }
        //store the HashMap in a serialized JSON String
        classGradesJ = gsonObj.toJson(classGrades);
    };
    
    //
    protected void importClass(HashMap cla){
        classGrades = cla;
        classGradesJ = gsonObj.toJson(classGrades);
    };
    
    
    /**
     * addStudent method
     * Purpose: Add a new student both to the AllStudents HashSet and 
     * ClassGrades HashMap (with a random grade), and then store the updated
     * HashMap in the serialized JSON String.
     * @param cla (AllStudents) - object
     * @param name (String)
     */
    @Override
    public void addStudent(AllStudents cla, String name){
        cla.addStudent(name);
        String gra = randomGrade();
        classGrades.put(name, gra);
        //store the updated HashMap in a serialized JSON String
        classGradesJ = gsonObj.toJson(classGrades);
    };

    
    
    /**
     * addStudentGr method
     * Purpose: Add a new student with theyr grade both to the AllStudents 
     * HashSet and ClassGrades HashMap, and then store the updated HashMap in 
     * the serialized JSON String.
     * @param cla (AllStudents) - object
     * @param name (String) - student name
     * @param gra (String) - grade, such as "A", "B", "C", "D", or "E"
     */
    @Override
    public void addStudentGr (AllStudents cla, String name, String gra){
        cla.addStudent(name);
        classGrades.put(name, gra);
        //store the updated HashMap in a serialized JSON String
        classGradesJ = gsonObj.toJson(classGrades);
    };

    public String getClassGradesJ() {
        return classGradesJ;
    }

    public void setClassGradesJ(String classGradeJ) {
        this.classGradesJ = classGradeJ;
    }
    
}
