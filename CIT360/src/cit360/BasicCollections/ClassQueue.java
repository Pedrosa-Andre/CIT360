/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicCollections;
import java.util.*;

/**
 * This class is created to define the order the students will be allowed to go
 * to the brake time based on the order they arrived on the class by using a
 * Queue object. A simple queue object list just add elements at the end of the 
 * list and just remove elements from the beginning of it.
 * @author Andre Matheus
 */
public class ClassQueue {

    private Queue<String> brakeQueue = new LinkedList<>();
    
    public ClassQueue() {
    }
        
    /**
     * addStudent method
     * Purpose: add students to the brake time queue
     * Parameters: name (String)
     * Returs: none
     */
    public void addStudent(String name) {
        //Different fom sets and maps, queues can have duplicated ellements so
        //in order to avoid duplicated names here I'm gonna add an if condition
        //that searches if the name is already on the queue.
        if (brakeQueue.contains(name)){
            System.out.println(name + " has already arrived");
        }else{
            brakeQueue.add(name);
            System.out.println(name + " arrived");
        }
    }
    
    /**
     * emptyQueue method
     * Purpose: empty the queue while showing the students (equivalent to 
     * leaving the students to the break time)
     * Parameters: none
     * Returs: none
     */
    public void emptyQueue(){
        int size = brakeQueue.size();
        System.out.println("Order to go to the brake time:");
        for (int i = 1; i<=size;i++){
            //The pool() method in the queue will always remove its firs element
            String name = brakeQueue.poll();
            System.out.println(i+" "+name);
        }
    }

    public Queue<String> getBrakeQueue() {
        return brakeQueue;
    }

    public void setBrakeQueue(Queue<String> brakeQueue) {
        this.brakeQueue = brakeQueue;
    }
    
    
    
}
