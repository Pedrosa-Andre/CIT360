

package cit360.BasicThreadsExeRun;

/**
 * // This is an example of a class that implements the Runnable interface.
 * // It allows their instances to be executed inside threads.
 * @author Andre Matheus
 */
public class ClassWithRunnable implements Runnable{
    
    // Just the code within the run() method will perform when an instance of
    // ClassWithRunnable is executed by a thread.
    @Override
    public void run() {
        System.out.println("I'm an example of object that implements Runnable");
    }
    
    // This other method isn't executed by the thread.
    public void saySmth(){
        System.out.println("I, saySmth(), am not called by the Thread");
    }

}
