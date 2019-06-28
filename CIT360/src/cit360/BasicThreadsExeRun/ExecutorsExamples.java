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
    
    // Then we create some simple runnables:
    Runnable ru1 = () -> System.out.println("Task 1 being excecuted");
    Runnable ru2 = () -> System.out.println("Task 2 being excecuted");
    Runnable ru3 = () -> System.out.println("Task 3 being excecuted");
    
    // Now we can use the submit() method to submit various runnables without  
    // the need to manually create threads to them (the executor does it 
    // automatically)
    executorS.submit(ru1);
    executorS.submit(ru2);
    executorS.submit(ru3);
    
    // It's important to always shut down the executor once it keeps active
    // waiting for new submissions not allowing your program to exit. You can do
    // either with .shutdown() or .shutdownNow() method. The difference is that
    // .shutdown() waits for the active threads to finish theyr tasks before 
    // shutting down the executor, while .shutdownNow() will kill all threads in
    // execution and then shut down.
    executorS.shutdown();
    
    
    //                  -----Executors with Thread Pools-----
    // The example above is an executor that can perform one thread at a time,
    // it is a good thing, but not really useful when we need to perform dozens
    // of different tasks, many at the same time. It's there the Thread Pools 
    // come in handy. Thread Pools are like a group of threads ready to receive
    // and run tasks. Each time you submit a task to an executor with a thread 
    // pool the executor will delegate the task to an empty thread until all 
    // the threads are occupied working. If you keep submitting tasks while all
    // threads are occupied the Executor will put them on a Blocking Queue where
    // they will wait until one thread fish a task and become available again.
    // Let's see this in action.
    
    // First we create an executor with a pool of multiple threads (in this case 2)
    ExecutorService executorPool = Executors.newFixedThreadPool(2);
    
    // Then some tasks
    TimedRunnable runnableA = new TimedRunnable("A",1000);
    TimedRunnable runnableB = new TimedRunnable("B",1000);
    TimedRunnable runnableC = new TimedRunnable("C",1000);
    TimedRunnable runnableD = new TimedRunnable("D",1000);
    TimedRunnable runnableE = new TimedRunnable("E",1000);
    TimedRunnable runnableF = new TimedRunnable("F",1000);
    
    // And now we can submit the tasks
    executorPool.submit(runnableA);
    executorPool.submit(runnableB);
    executorPool.submit(runnableC);
    executorPool.submit(runnableD);
    executorPool.submit(runnableE);
    executorPool.submit(runnableF);
    
    // Possible Output (the order may vary a bit):      // Notice the tasks are 
    // Task B finished in pool-2-thread-2               // finished two at a time
    // Task A finished in pool-2-thread-1               // because there are two
    // Task D finished in pool-2-thread-1               // threads in the executor
    // Task C finished in pool-2-thread-2
    // Task F finished in pool-2-thread-2
    // Task E finished in pool-2-thread-1
    
    executorPool.shutdown();
        
    
    //                       -----Atomic Variables-----
    // See more in the link bellow...
    AtomicVarExamples at =  new AtomicVarExamples(); //ctrl+click to go
    
    
    }

}
