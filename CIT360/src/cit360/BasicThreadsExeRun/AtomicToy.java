/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicThreadsExeRun;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Andre Matheus
 */
public class AtomicToy {
    
    // The Atomic variables allow just one method/thread/etc to access them at a 
    // time. This avoid overlaping access memory problems.
    // The synchronized word makes the method or class permit only one thread to
    // access them at a time.
    
    
    // This is an atomic variable. I made it public purposefully to show its
    // power to handle multiple threads accessing it.
    public AtomicInteger transactions = new AtomicInteger(0); //How many transactions were made

//  private AtomicInteger numberInStock = new AtomicInteger(0); //How many toys are in stock
    // This was another atomic variable, but as it was only accessed by a 
    // synchronized method I commented it out and will use a simple variable 
    // instead to show how the synchronized can handle multiple threads using it.
    private int numberInStock = 0;

    
    public AtomicToy(int initialStock){
//      this.numberInStock.set(initialStock); //Code if it was an AtomicInteger.
        this.numberInStock = initialStock;
    }
    
    // This is how the buyOrEnter() method would look if it was working with
    // an atomic variable (notice the methods I used to access/change/get data).
//  public synchronized void buyOrEnter(int n){ //positive number->buy negative number->enter
//      if (n < 0){ //if negative -> enter n toys
//          
//          int initialStock = numberInStock.get();           //Get initial stock
//          numberInStock.set(numberInStock.addAndGet(n*-1)); //Change current stock
//          int finalStock = numberInStock.get();             //Get final stock
//          
//          // Print to the user how many toys were entered and the initial and 
//          // final stock values
//          System.out.println("Entered " + n*-1 + " toys. Initial Stock = " +
//                  initialStock + " Final Stock = " + finalStock);
//          
//      } else if (n <= numberInStock.intValue()){ //if positive and less then or equal to stock -> buy n toys
//          
//          int initialStock = numberInStock.get();           //Get initial stock
//          numberInStock.set(numberInStock.addAndGet(n*-1)); //Change current stock
//          int finalStock = numberInStock.get();             //Get final stock
//            
//          // Print to the user how many toys were bought and the initial and 
//          // final stock values
//          System.out.println("Bough " + n + " toys. Initial Stock = " + 
//                  initialStock + " Final Stock = " + finalStock);
//          
//      } else { //if positive and bigger than stock -> say it's impossible
//          
//          //Get current stock and print it to the user
//          int inStock = numberInStock.get(); 
//          System.out.println("Not enoug in stock. Asked: "+n+" In Stock: "+inStock);
//      }
//  }
  
    // This is an example od a synchronised method.
    public synchronized void buyOrEnter(int n){ //positive number->buy negative number->enter
        if (n < 0){ //if negative -> enter n toys
            
            int initialStock = numberInStock;           //Get initial stock
            numberInStock = numberInStock - n;          //Change current stock
            int finalStock = numberInStock;             //Get final stock
            
            // Print to the user how many toys were entered and the initial and 
            // final stock values
            System.out.println("Entered " + n*-1 + " toys. Initial Stock = " +
                    initialStock + " Final Stock = " + finalStock);
            
        } else if (n <= numberInStock){ //if positive and less then or equal to stock -> buy n toys
            
            int initialStock = numberInStock;           //Get initial stock
            numberInStock = numberInStock - n;          //Change current stock
            int finalStock = numberInStock;             //Get final stock
            
            // Print to the user how many toys were bought and the initial and 
            // final stock values
            System.out.println("Bough " + n + " toys. Initial Stock = " + 
                    initialStock + " Final Stock = " + finalStock);
            
        } else { //if positive and bigger than stock -> say it's impossible
            
            //Get current stock and print it to the user
            int inStock = numberInStock; 
            System.out.println("Not enoug in stock. Asked: "+n+" In Stock: "+inStock);
        }
    }
    
    
}
