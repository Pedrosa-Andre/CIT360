

package cit360.BasicThreadsExeRun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre Matheus
 */
public class BasicThreadsExeRunSandbox {
    
    public static void main(String[] args){
    
    // Okay, so let's start with this absolutely interesting subject that is 
    // Threads, Executors, Runnables, and etc. I'm loving to learn about it.
    
    //                           -----Treads-----
    // Threads are like occupied paths in the CPU memory where tasks can be 
    // performed (I know there are better definitions on the web, but I tried
    // to use my words here). A process (an instance of a program in execution)
    // can have one or multiple threads.
    
    // Java has a Thread class you can use to create a thread and perform tasks.
    // The Thread class has a default empty method called run() that is the 
    // method called when running the thread. You must override this method to 
    // add the code (task) you want it to perform.
    
    //You can see an example in the ThreadExample class here (ctrl+click bellow)    
    ThreadExample tr = new ThreadExample();//No purpose besides being a shortcut
    
    
    //                          -----Runables-----
    // Runnable is a Java interface that can be implemented to classes to allow
    // their instances to be run inside a Thread. The Runnable interface has 
    // the abstract method run() that you may override with the code you want to
    // be performed when the class object is executed by a thread.
    
    // First, let's create an instance of a ClassWithRunnable class.
    ClassWithRunnable runnable = new ClassWithRunnable();//See more with ctrl+click
    
    // Then we create a thread and put the runnable object in the constructor.
    Thread tread = new Thread(runnable);
    
    // When we start the thread it will excecute the task inside the run() 
    // method from the ClassWithRunnable instance. Notice the other class 
    // methods aren't called by the thread.
    tread.start();
    
    // Output:
    // I'm an example of object that implements Runnable
    
    // Another interesting point about Runnable is that, as it's a functional
    // interface, you can instantiate it with a lambda expression making code 
    // more concise.
    Runnable runnableShort = () ->  System.out.println("I was instatiated with a Lambda expression");
    
    Thread thread2 = new Thread(runnableShort);
    
    thread2.start();
    
    // Output:
    // I was instatiated with a Lambda expression
    
    //    ---sleep()----
    
    // you can use the sleep(n) method to pause a currently active thread for n 
    // milliseconds, here is an example:
    
    Runnable runnableWithSleep = () -> {
        String[] list = {"1","2","3","4","5"};
        
        System.out.println("Counting from 1 to 5");
        
        // Here for each item in 'list' the program print the item and stop 
        // (sleep) for one second.
        for (String number:list){
            System.out.print(number+" ");        
            try {
                Thread.sleep(1000); // The sleep method must be surrounded by a 
                                    // try-catch block because it can throw an 
                                    // InterruptedException.
            } catch (InterruptedException ex) {
                Logger.getLogger(BasicThreadsExeRunSandbox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    };
    
    Thread thread3 = new Thread(runnableWithSleep);
    
    thread3.start();
    
    // Output:
    // Counting from 1 to 5
    // 1 2 3 4 5                 //Notice the 1 second delay between each number
    
    
    //                          -----Excecutors-----
    // See more in the link bellow...
    ExecutorsExamples ex = new ExecutorsExamples(); //ctrl+click to go    
    
    
    }

}
