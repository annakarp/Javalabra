/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;
import javax.swing.JLabel;
import OhHa.Kysymysrekisteri;

/**
 *
 *
 *
 * @author AK
 *
 */
public class Peli implements Runnable {
    private boolean kaynnissa;
    private int rajaAika;
    private PeliRuutu peliruutu;
    private Kysymysrekisteri rekisteri;

    public Peli(int rajaAika, Kysymysrekisteri rekisteri) {
        this.peliruutu = new PeliRuutu();
        this.rajaAika = rajaAika;
        this.rekisteri = rekisteri;
        peliruutu.run();

    }

    @Override
    public void run() {
        this.kaynnissa = true;
//        int aika = 0;
//        long start = System.currentTimeMillis();
//        while (kaynnissa) {
//            if (aika >= this.rajaAika) {
//                kaynnissa = false;
//            }
//            if (System.currentTimeMillis() - start >= 1000) {
//                aika++;
//                this.peliruutu.setKello(aika);
//                //System.out.println(aika);
//                start = System.currentTimeMillis();
//            }
//
//        }

    }
}
