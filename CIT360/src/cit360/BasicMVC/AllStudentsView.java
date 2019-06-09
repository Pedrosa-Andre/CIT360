/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicMVC;
import java.util.Scanner;

/**
 * View layer: This layer is responsible for the visual part of the program 
 * (User Interface). Its methods determine how things are going to be displayed 
 * and how the interface will react to the user's prompts and interactions. When
 * a user requests something that needs access to the data of the program the 
 * view layer *does not* access the Model layer directly. Instead, it just calls
 * Control layer methods (responsible for the communication between View and
 * Model layers).
 * @author Andre Matheus
 */
public class AllStudentsView {
    
    
    private Scanner entry = new Scanner(System.in);
    
    //Main menu view
    public void start(){
        System.out.println("Select what do tou want to do (type number):");
        System.out.println("1 - Add a student to the class");
        System.out.println("2 - See the current class students");
        System.out.println("3 - Quit");
        String opt = entry.next();
        doAction(opt);
    }
    
    //Depending on the option you choose it will call a different Control method
    public void doAction(String option){
        switch (option){
                case "1":
                    System.out.println("");
                    System.out.println("Enter a student name:");
                    String opt = entry.next();
                    //Call .addName() from the Contro layer
                    System.out.println(AllStudentsControl.addName(opt));
                    System.out.println("");
                    start();
                    break;
                case "2":
                    System.out.println("Students in the class:");
                    //Call .showClass() from the Control layer
                    for (Object name : AllStudentsControl.showClass()){
                        System.out.println(name);
                    }
                    System.out.println("");
                    start();
                    break;
                case "3":
                    System.out.println("Good bye");
                    break;
        }
                    
    }
    
}
