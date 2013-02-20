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

/**
 * luokka Pelaaja antaa pelin käyttäjälle parametrit elin nimimerkin sekä pisteet
 * @author annakarp
 */

public class Pelaaja {
    private String nimimerkki;
    private int pisteet;

    public Pelaaja(String nimimerkki) {
        this.pisteet = 0;
        this.nimimerkki = nimimerkki;
    }

    public String getNimimerkki() {
        return nimimerkki;
    }

    public int getPisteet() {
        return pisteet;
    }
    
    public void kasvataPisteita(int aikaajaljella) {
        this.pisteet += aikaajaljella;
    }
    
    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }
    
    
    
}
