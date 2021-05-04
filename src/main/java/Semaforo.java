


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Semaforo {
    int v;

    public Semaforo(int v) {
        this.v = v;
    }
    synchronized public void p(){ 
    while(v==0){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    v--;
    }
    synchronized public void v(){
    v++;
    notify();
    }
}