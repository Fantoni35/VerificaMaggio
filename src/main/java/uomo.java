

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
public class uomo extends Thread{
    Semaforo pieno;
    

    public uomo(Semaforo pieno) {
        this.pieno = pieno;
    }

    uomo(Semaforo BagnoU, donna c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void run(){
        
         
            pieno.p(); //la risorsa non è disponibile
            System.out.println("il bagno degli uomini è occupato"); //Stampa quando è occupato e aspetta 5 secondi prima di liberarlo e stampa che è libero
            try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
            System.out.println("il bagno degli uomini ora è libero");
            
            pieno.v(); // la risorsa è disponibile
        } 
        
    
}
