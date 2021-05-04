

import static java.lang.Thread.sleep;
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
public class donna extends Thread {
   Semaforo pieno1;
  

    public donna(Semaforo pieno1) {
        this.pieno1 = pieno1;
       
    }

    donna(Semaforo BagnoD, uomo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public void run(){
        
        
            pieno1.p(); //la risorsa non è disponibile
            System.out.println("il bagno delle donne è occupato");
            try {
            sleep(5000);
        } catch (InterruptedException ex) { //Stampa quando è occupato e aspetta 5 secondi prima di liberarlo e stampa che è libero
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
            System.out.println("il bagno delle donne ora è libero");
            
            pieno1.v(); //la risorsa è disponibile
        } 
}
