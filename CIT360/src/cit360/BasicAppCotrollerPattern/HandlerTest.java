/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicAppCotrollerPattern;

/**
 *
 * @author Andre Matheus
 */
public class HandlerTest implements Handler{
    
    @Override
    public void handleIt(Object data){
        String st = (String)data;
        System.out.println(st);
    }
    
}
