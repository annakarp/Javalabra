/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Apuluokat.KysymysGeneraattori;
import Apuluokat.KysymysLataaja;
import Peli.MuistiPeli;
import java.io.FileNotFoundException;

/**
 *
 * @author AK
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        KysymysLataaja lataaja = new KysymysLataaja(args[0]);
        KysymysGeneraattori generaattori = new KysymysGeneraattori(lataaja);
        MuistiPeli peli = new MuistiPeli(generaattori); 
        
        peli.run();
        
        
       
    }
    
}