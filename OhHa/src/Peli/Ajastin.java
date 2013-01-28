/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

import javax.swing.JLabel;

/**
 *
 *
 *
 * @author AK
 *
 */
public class Ajastin implements Runnable {
    private int rajaAika;
    private int aika;
    private JLabel kello;

    public Ajastin(int rajaAika, JLabel kello) {
        this.rajaAika = rajaAika;
        this.aika = 0;
        this.kello = kello;

    }

    public void nollaa() {
        this.aika = 0;

    }

    public boolean getAikaaJaljella() {
        if (aika <= rajaAika) {
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (this.rajaAika > aika) {
            if (System.currentTimeMillis() - start >= 1000) {
                aika++;
                this.kello.setText(Integer.toString(aika));
            }

        }

    }
}
