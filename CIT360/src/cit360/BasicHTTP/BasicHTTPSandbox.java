/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicHTTP;

import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Andre Matheus
 */
public class BasicHTTPSandbox {
    
    public static void sandbox() {
        HTTPClass ht = new HTTPClass();
        try {
            
            //Happy path - use a valid URL to access a JSON file
            System.out.println("--------------------Example of reading a JSON File---------------------");
            ht.getURLdata("https://pedrosa-andre.github.io/assignments/lesson-10/scripts/cities.json");
            System.out.println("");
            //Result - print the .json file to the console

            //Happy path - use a valid URL to access an HTML page
            System.out.println("-------------------Example of reading an HTML page---------------------");
            ht.getURLdata("https://pedrosa-andre.github.io/");
            //Result - print the .html text to the console
            
            //Nasty path - use an invlaid URL
            System.out.println("-------------Example of trying to access an invalid URL----------------");
            ht.getURLdata("https://pedros-andre.github.io/assignments/lesson-10/scripts/cities.json");
            System.out.println("");
            //Result - catch and print a FileNotFound exeption

            //Nasty path - use a valid URL to access an invalid file type
            System.out.println("--Example trying to read a file of ivalid type (in this case an image)--");
            ht.getURLdata("https://pedrosa-andre.github.io/assignments/weathersite/images/wtlogo.png");
            System.out.println("");
            //Result - print a glitchy text
            
        } catch (Exception ex) {
            Logger.getLogger(BasicHTTPSandbox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
