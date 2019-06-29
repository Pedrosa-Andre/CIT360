/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Andre Matheus
 */

//                          Oversimplified map of classes
// 
//  +------+     +---------+         +---------------+       +------------+                                    
//  | User |---->| NewMain |-------->| AppController |<>-----| handlerMap |                                                            
//  +------+     +---------+         +---------------+       +------------+                                 
//                                      |    |   |          
//                      ________________|    |   |_________________                                     
//                     |                     |                     |                                    
//                     V                     V                     V                                    
//           +-------------------+ +-------------------+ +-------------------+                                                                                          
//           | HandlerAddStudent | | HandlerGetStudent | | HandlerGetStuList |                                                                
//           +-------------------+ +-------------------+ +-------------------+                                                               
//                   |     |                 |                     |                                   
//                   |     |_________________|_____________________|                                   
//                   |                                             |                                   
//                   V                                             V                                   
//              +---------+                                +---------------+                                                                                          
//              | Student |                                | ClassStudents |                                                                
//              +---------+                                +---------------+    
                                                                              


public class NewMain {
       
    private static Scanner entry = new Scanner(System.in);
    
    // Create AppController instance (appConEx)
    private static AppController appConEx = new AppController();
    
    public static void main(String[] args) {

        // Create instances of each Handler class.
        Handler handAddStudent = new HandlerAddStudent();
        Handler handGetStudent = new HandlerGetStudent();
        Handler handGetStuList = new HandlerGetStuList();


        // Use the AppController.addCommand(String newCommand, Handler newHandler)
        // method to add a command String related to a Handler in a HashMap 
        // that will map them, so the .handleRequest() method can search for it.
        appConEx.addCommand("addS", handAddStudent);
        appConEx.addCommand("getS", handGetStudent);
        appConEx.addCommand("getL", handGetStuList); 
        
        start();

    }

    // Main menu view where the user can perform actions/request tasks.
    public static void start(){
        System.out.println("Select what do you want to do (type number):");
        System.out.println("1 - Add a student to the class");
        System.out.println("2 - Get info about a student");
        System.out.println("3 - See the current class students");
        System.out.println("4 - Quit");
        String opt = entry.next();
        doAction(opt);
    }

    
    public static void doAction(String option){
        
    // These actions just handle the user inputs and them send them to the 
    // appConEx using the handleRequest(String command,Object data) method. It's 
    // the appConEx role to discover witch Handler to call by searching the 
    // correct handler in the handlerMap HashMap using the given command. Once
    // it finds the correct Handler instance it calls the handler handleIt()
    // method that will perform different tasks depending on the Handler instance/type.

        switch (option){
            case "1":
                // Get user input
                System.out.println("");
                System.out.println("Enter a student first name:");
                String fName = entry.next();
                System.out.println("Enter a student last name:");
                String lName = entry.next();
                HashMap<String,String> nameMap = new HashMap();
                nameMap.put("fName", fName);
                nameMap.put("lName", lName);
                // Call .handleRequest() method
                appConEx.handleRequest("addS",nameMap); // Notice each call send
                // a command (String) and a diferent data type. The Handlers (as
                // the name suggests) areprepared to handle this.
                System.out.println("");
                start();
                break;
            case "2":
                // Get user input
                System.out.println("Enter a student first name:");
                String fdName = entry.next();
                // Call .handlerequest() method
                appConEx.handleRequest("getS",fdName);                
                System.out.println("");
                start();
                break;
            case "3":
                // Call .handlerequest() method                
                appConEx.handleRequest("getL",null);                
                System.out.println("");
                start();
                break;
            case "4":
                System.out.println("Good bye");
                break;
        }
    }
                    
}
   

