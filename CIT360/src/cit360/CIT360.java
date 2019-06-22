/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;
import cit360.BasicCollections.CallBasicCollections;
import cit360.BasicJSON.BasicJSONSandbox;
import cit360.BasicMVC.BasicMVCSandbox;
import cit360.BasicHTTP.BasicHTTPSandbox;
import cit360.BasicJUnit.StudentForm;
import java.lang.Object;
//import java.io.*;
//import java.util.*;
//import com.google.gson.*;
/**
 *
 * @author Andre Matheus
 */
public class CIT360 {


    public static void main(String[] args) {

        //To see basic Collections sandbox examples uncomment the coment bellow
        //CallBasicCollections.basicColectionsExamples();
        
        //To see basic JSON sandbox examples uncomment the coment bellow
        //BasicJSONSandbox.sandbox();
        
        //To see basic MVC classes in action uncomment the coment bellow
        //BasicMVCSandbox.sandbox();
        
        //To see basic HTTP sandbox examples uncomment the coment bellow
        //BasicHTTPSandbox.sandbox();
        
        StudentForm a1 = new StudentForm();
        StudentForm a2 = new StudentForm();
        Integer at = a1.getAge();
        Integer bt = a2.getAge();
        String a = "111";
        String b = "111";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(at == bt);
        System.out.println(at.equals(bt));
        System.out.println(a == b);
        System.out.println(a.equals(b));
//        System.out.println(a1.getAge());
        
        
        
        
    }
    
}
