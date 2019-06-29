/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

import java.util.HashMap;

/**
 *
 * @author Andre Matheus
 */
public class AppController {
    
    //The HashMap the correlates the commands with the handler instance
    HashMap<String,Handler> handlerMap = new HashMap(); 
    
    public void handleRequest(String command,Object data){
        // Look in the HashMap for the proper handler instance
        Handler someHandler = handlerMap.get(command);
        if(someHandler!=null){
            // Call the handler.handleIt() method (that will integrate different
            // codes accordind the the handler type).
            someHandler.handleIt(data);
        }
    }
    
    // This method store a command String and a handler instance in a HashMap
    public void addCommand(String newCommand, Handler newHandler){
        handlerMap.put(newCommand, newHandler);
    }

}
