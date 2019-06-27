/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicThreadsExeRun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Andre Matheus
 */
public class ExecutorsExamples {
    
public static void main(String[] args){
    
    //                          -----Excecutors-----
    // Executors are frameworks for creating am managing threads. You may have 
    // noticed in the previous examples that I had to create one thread for each
    // task/runnable I wanted to execute. Executors classes make this work a lot
    // easier.
    
    // An example of an Executor class is the ExecutorService, let's see some 
    // examples of this class in action.
    
    // First we create an ExecutorService instance:
    ExecutorService executorS = Executors.newSingleThreadExecutor();
    
    // Then we create some sample runnables:
    Runnable ru1 = () -> System.out.println("task 1 being excecuted");
    Runnable ru2 = () -> System.out.println("task 2 being excecuted");
    Runnable ru3 = () -> System.out.println("task 3 being excecuted");
    
    // Now we can use the submit() method to submit various runnables without  
    // the need to manually create threads to them (the executor does it 
    // automatically)
    executorS.submit(ru1);
    executorS.submit(ru2);
    executorS.submit(ru3);
    
    executorS.shutdown();




}

}
