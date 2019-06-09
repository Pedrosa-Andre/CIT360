/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicJSON;

import cit360.BasicCollections.AllStudents;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Andre Matheus
 */
public class BasicJSONSandbox {
    public static void sandbox(){
        

        //To see basic Collections sandbox examples uncomment the coment bellow
        //CallBasicCollections.basicColectionsExamples();
        
        //First let us create an AllStudents object and populate it
        AllStudents class102 = new AllStudents();
        class102.addStudent("Stanley");
        class102.addStudent("Chell");
        class102.addStudent("Weatley");
        class102.addStudent("Cave");
        class102.addStudent("Carolin");
        class102.addStudent("Braid");
        System.out.println("");

        //Happy path - import class102 HashSet to class102Json HashMap using the
        //new Overrided method an then print the Map and the JSON String.
        ClassGradesJson class102Json = new ClassGradesJson(class102);
        System.out.println("class102Json HashMap and JSON");
        System.out.println(class102Json.getClassGrades() + " <- HashMap");
        System.out.println(class102Json.getClassGradesJ() + " <- JSON Object");
        System.out.println("");
        //Result - print the HashMap and the JSON String representation
        
        //Happy path - use the Gson.fromJson() method to show how is possible
        //to convert a JSON object to another Java object (a HashMap in this 
        //case)
        Gson j = new Gson();
        //in this case I'm using the class102Json JSON String
        HashMap hash = j.fromJson(class102Json.getClassGradesJ(),HashMap.class);
        System.out.println("class102Json JSON to HashMap");
        System.out.println(hash + " <- turned into HashMap again");
        System.out.println("");
        //Result - print a HashMap
        
        //Happy path - use Gson.toJson() and .fromJson() to convert an object to
        //JSON file (.json) and then convert the file to object againg.
        System.out.println(".json file converted to HashMap");
          //Converting HashMap to JSON file
        try(FileWriter file = new FileWriter("C:\\ClassHashMap.json")){
            j.toJson(hash,file);
        }catch (IOException e){
            e.getMessage();
        }
          //Converting JSON file to HashMap
        try(Reader fileR = new FileReader("C:\\ClassHashMap.json")){
            HashMap fileToMap = j.fromJson(fileR, HashMap.class);
            System.out.println(fileToMap + " <- .json file to HashMap");
            System.out.println("");
        }catch (IOException e){
            e.getMessage();
        }
        //Result - print the HashMap
        
        //Nasty path - try to convert a JSON object to a unconpatible class type
        System.out.println("JSON object (with HashMap) converted to HashSet");
        try {
            //in this case, the JSON object is storing a HashMap and we are 
            //trying to transfer it to a HashSet
            HashSet eer = j.fromJson(class102Json.getClassGradesJ(),HashSet.class);
            System.out.println(eer);
        } catch (Exception e) {
            System.out.println("Error: .fromJson() method can not "
                                + "convert incompatible class types");
        }        
        //Result - print an error message
    }
}
