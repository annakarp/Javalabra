/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;
import java.util.ArrayList;
import java.util.HashMap;
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

    /** käynnistää pelin sekä arpoo maan eli seuraavan kysymyksen pelissä, asettaa
     *  peliruudulle kysymyksen, maan ja kaupungit
     *
     * @param 
     */
    
    
    @Override
    public void run() {
    // try{
    // Thread.currentThread().wait();
    // }
    // catch (Exception e){
    // System.out.println("Pahasti pieleen!");
    // }
        this.kaynnissa = true;
        boolean vastattu = true;
        Kysymys kysymys;
        String maa = this.rekisteri.arvoMaa();
        kysymys = new Kysymys(this.rekisteri.paakaupunki(maa), this.rekisteri.vaihtoehdot(maa, this.rekisteri.paakaupunki(maa)), maa);
        kysymys.kirjoitaVaihtoehdot(this.peliruutu.napit());
        kysymys.kysymys(this.peliruutu.getKysymys());
        vastattu = false;
    // while(kaynnissa){
    //
    // if(vastattu){
    // maa = this.rekisteri.arvoMaa();
    // kysymys = new Kysymys(this.rekisteri.paakaupunki(maa),this.rekisteri.vaihtoehdot(maa, this.rekisteri.paakaupunki(maa)),maa);
    // kysymys.kirjoitaVaihtoehdot(this.peliruutu.napit());
    // kysymys.kysymys(this.peliruutu.getKysymys());
    // vastattu = false;
    // }
    //
    // if(this.peliruutu.getVastaus() != null){
    // kysymys.oikeaVaiVaara(this.peliruutu.getVastaus());
    // vastattu = true;
    // }
    // }
    // int aika = 0;
    // long start = System.currentTimeMillis();
    // while(kaynnissa){
    // if(aika >= this.rajaAika){
    // kaynnissa = false;
    // }
    // if(System.currentTimeMillis() - start >= 1000){
    // aika++;
    // this.peliruutu.setKello(aika);
    // System.out.println(aika);
    // start = System.currentTimeMillis();
    // }
    // }
    }
}
