

package cit360.BasicThreadsExeRun;

/**
 *
 * @author Andre Matheus
 */
public class ThreadExample extends Thread {
    
    @Override
    public void run(){
        System.out.println("I'm a task being executed inside "+
                Thread.currentThread().getName()); // Get the Thread's name
    }
    
    public static void main(String[] args){
        
        Thread thr = new ThreadExample(); // Create thread
        
        thr.start(); // Start thread
        
        // Output:
        // I'm a task being executed inside Thread-0
    
    }

}
