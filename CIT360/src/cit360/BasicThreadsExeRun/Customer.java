/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicThreadsExeRun;

/**
 *
 * @author Andre Matheus
 */
public class Customer implements Runnable{
    
    // This class is an example of a customer.
    
    // This represents the quantity of a toy the customer will buy or give.
    int quantity = 0;
    // This indicates witch toy the customer will buy or give.
    AtomicToy toy;
    
    // The constructor takes a AtomicToy object and an int as parameters.
    public Customer(int _quantity, AtomicToy _toy) {
        this.quantity = _quantity;
        this.toy = _toy;
    }    
    
    // The run method (excecuted by the thread) calls the .buyOrEnter() method
    // from the given AtomicToy instance to change its "stock" and increment
    // its transaction counter.
    @Override
    public void run() {
        this.toy.buyOrEnter(quantity);
        incrementCounter();
    }
    
    // Increment the transaction counter. As the 'transactions' variable is an
    // atomic variable it deals well with multiple threads accesses.
    public int incrementCounter(){
        return this.toy.transactions.incrementAndGet();
    }

}
