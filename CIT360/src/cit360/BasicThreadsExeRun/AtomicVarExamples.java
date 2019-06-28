

package cit360.BasicThreadsExeRun;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Andre Matheus
 */
public class AtomicVarExamples {
    

    
public static void main(String[] args){

    
    
    //                       -----Atomic Variables-----
    //   One of the negative points that come with multi-threading programs are 
    // new problems that can come with simultaneous access to data (such as 
    // thread interference or memory consistency errors). For example, a 
    // variable that is changed by many threads at the same time may have 
    // problems to keep an accurate value because while one thread gets its 
    // value and is processing it to return a new value, a second thread can 
    // also access the still unchanged variable in between this process, change 
    // it and store another value right after thread one, overriding the first 
    // change as if it never happened.
    //   Fortunately, Java has implemented functions to overcome it, like the 
    // "Synchronized" keyword (that can be applied to methods or classes) or the
    // Atomic variables. What they do is manage multiple threads accesses by 
    // allowing just one thread to use/change them at a time.
    // Here is a simple program that exemplifies how Atomic variables are useful.
    
    
    // Create an AtomicToy instance (a teddy bear) with initial stock of 10
    AtomicToy teddyBear = new AtomicToy(10); //ctrl+click to see more
    
    // Create mulltiple customers (threads), each with a different value to buy
    // or give
    Customer cust1 = new Customer(0,teddyBear); //ctrl+click to see more
    Customer cust2 = new Customer(3,teddyBear);
    Customer cust3 = new Customer(2,teddyBear);
    Customer cust4 = new Customer(1,teddyBear);
    Customer cust5 = new Customer(-3,teddyBear);
    Customer cust6 = new Customer(4,teddyBear);
    Customer cust7 = new Customer(-2,teddyBear);
    Customer cust8 = new Customer(5,teddyBear);
    Customer cust9 = new Customer(1,teddyBear);
    Customer cust10 = new Customer(-1,teddyBear);
    
    // Create an excecutor with a Thread Pool of size 4 (it means it can perform
    // until 4 simultaneous threads).
    ExecutorService executorPool = Executors.newFixedThreadPool(4);    
    
    // Submit the tasks.
    executorPool.submit(cust1);
    executorPool.submit(cust2);
    executorPool.submit(cust3);
    executorPool.submit(cust4);
    executorPool.submit(cust5);
    executorPool.submit(cust6);
    executorPool.submit(cust7);
    executorPool.submit(cust8);
    executorPool.submit(cust9);
    executorPool.submit(cust10);    
    
    executorPool.shutdown();
    
    // Wait until the executor is shut down to print the total transactions number
    while(!executorPool.isTerminated()){
    }
    System.out.println("Total teddybear transactions: "+teddyBear.transactions);
    // The output may vary in the order, but you can see how the AtomicToy class
    // works flawlessly thanks to the atomic variables and synchronized methods.
    
    
    // The End (see aditional content in the other classes).    
    
    }
    
    
}
