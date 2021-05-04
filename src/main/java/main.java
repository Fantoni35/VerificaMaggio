/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Semaforo BagnoU=new Semaforo(1);
        Semaforo BagnoD= new Semaforo(1);
        
       
       
       uomo a=new uomo(BagnoD);
       Thread Persona1=new donna(BagnoD,a);
        uomo b=new uomo(BagnoD);
       Thread Persona2=new donna(BagnoD,b);
       donna c=new donna(BagnoU);
       Thread Persona3=new uomo(BagnoU,c);
       donna d=new donna(BagnoU);
       Thread Persona4=new uomo(BagnoU,d);
       
       Persona1.start();
       Persona2.start();
       Persona3.start();
       Persona4.start();
       
    }
    
}
