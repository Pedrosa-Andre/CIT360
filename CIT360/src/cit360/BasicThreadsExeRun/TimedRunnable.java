/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.BasicThreadsExeRun;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre Matheus
 */
public class TimedRunnable implements Runnable{
    
    String name = "A";
    int time = 1000;
    
    TimedRunnable(String _name, int _time){
        this.name = _name;
        this.time = _time;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(time);
            System.out.println("Task "+name+" finished in "+Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(BasicThreadsExeRunSandbox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
