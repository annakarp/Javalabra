/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

/**
 *
 * @author annakarp
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Apuluokat.KysymysGeneraattori;

/**
 *luokka MuistiPeli 
 * @author AK
 */
public class MuistiPeli implements Runnable{
    KysymysGeneraattori generaattori;
    PeliRuutu peliruutu;
    
    public MuistiPeli(KysymysGeneraattori generaattori) {
        this.generaattori = generaattori;
    }
    
    @Override
    public void run(){
        peliruutu = new PeliRuutu(generaattori);
    }
    
    
}