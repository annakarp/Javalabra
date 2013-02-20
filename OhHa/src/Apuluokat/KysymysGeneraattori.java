/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuluokat;

/**
 *
 * @author annakarp
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Peli.Kysymys;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *luokka KysymysGeneraattori lataa kysymykset rekisteristä, tsekkaa onko kysymykset mahdollisesti loppu sekä
 * arpoo satunnaisesti uuden kysymyksen
 * @author AK
 */
public class KysymysGeneraattori {

    private List<Kysymys> kysymykset;
    private KysymysLataaja lataaja;
    
    public KysymysGeneraattori(KysymysLataaja lataaja) throws FileNotFoundException {
        this.lataaja = lataaja;
        lataaKysymykset();
    }
    
    /**
     * metodi generoiKysymys arpoo satunnaisen kysymyksen ja vastausvaihtoehdot
     * @return kysymys-luokan olion
     */
    
    public Kysymys generoiKysymys() {
        int kysymyksenIndeksi = 0 + (int)(Math.random() * (((kysymykset.size()-1)) + 1));
        Kysymys generoituKysymys = kysymykset.get(kysymyksenIndeksi);
        kysymykset.remove(kysymyksenIndeksi);
        return generoituKysymys;
    }
    
    /**
     * metodi kysymyksetLoppu tsekkaa onko kysymykset lista tyhja
     * @return palauttaa totuusarvon
     */
    
    public boolean kysymyksetLoppu() {
        if(kysymykset.isEmpty())
            return true;
        
        return false;
    }
    
    /**
     * metodi lataaKysymykset lataa kysymykset-listan generaattorin käåytettäväksi käyttämällä luokan 
     * KysymysLataaja luokan lataa-metodia 
     * @throws FileNotFoundException jos lataus ei onnistu
     */
    
    private void lataaKysymykset() throws FileNotFoundException {
        kysymykset = lataaja.lataa();
    }
}