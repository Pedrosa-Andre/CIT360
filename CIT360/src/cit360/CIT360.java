/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;
import cit360.BasicCollections.CallBasicCollections;
import cit360.BasicJSON.BasicJSONSandbox;
import cit360.BasicMVC.BasicMVCSandbox;
import cit360.BasicHTTP.HTTPClass;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        //To see basic MVC sandbox examples uncomment the coment bellow
        //BasicMVCSandbox.sandbox();
        
        HTTPClass ht = new HTTPClass();
        try {
            ht.test();
        } catch (Exception ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("FAIL");
        }
        
    }
    
}
