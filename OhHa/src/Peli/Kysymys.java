/** hallinnoi tarkemmin maita, pääkaupunkeja ja kaupunkeja, hashmapilla ja arraylistalla
 *
 * @param 
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 *
 *
 * @author AK
 *
 */
public class Kysymys {
    private String paakaupunki;
    private ArrayList<String> vastausvaihtoehdot;
    private String kysymys;

    public Kysymys(String paakaupunki, ArrayList<String> vastausvaihtoehdot, String kysymys) {
        this.paakaupunki = paakaupunki;
        this.vastausvaihtoehdot = vaihtoehdot(vastausvaihtoehdot);
        this.kysymys = "Mikä on tämän maan pääkaupunki? " + kysymys;

    }

    private ArrayList<String> vaihtoehdot(ArrayList<String> vastausvaihtoehdot) {
        Random random = new Random();
        ArrayList<String> vaihtoehdot = new ArrayList<String>();
        LinkedList<Integer> arvotutIndeksit = new LinkedList<Integer>();
        for (int i = 0; i < 3; i++) {
            int luku = random.nextInt(vastausvaihtoehdot.size());
            while (arvotutIndeksit.contains(luku)) {
                luku = random.nextInt(vastausvaihtoehdot.size());
            }
            vaihtoehdot.add(vastausvaihtoehdot.get(luku));
            arvotutIndeksit.add(luku);
        }
        return vaihtoehdot;
    }

    public void kirjoitaVaihtoehdot(ArrayList<JButton> nappulat) { // a 0, b 1, c 2,d 3
        Random random = new Random();
        int oikea = random.nextInt(4);
        int sijoitettavaVaara = 0;
        for (int i = 0; i < 4; i++) {
            if (i == oikea) {
                nappulat.get(i).setText(paakaupunki);
                continue;
            }
            nappulat.get(i).setText(vastausvaihtoehdot.get(sijoitettavaVaara));
            sijoitettavaVaara++;
        }
    }

    public boolean oikeaVaiVaara(String vastaus) {
        if (vastaus.equals(paakaupunki)) {
            return true;
        } else {
            return false;
        }
    }

    public void kysymys(JLabel kysymys) {
        kysymys.setText(this.kysymys);

    }
    
//    public String toString(){
//        return kysymys;
//    }

    public void poistaKaksiVaaraa(ArrayList<JButton> nappulat) {
        int poistetut = 0;
        for (String poistettava : vastausvaihtoehdot) {
            for (JButton jButton : nappulat) {
                if (jButton.getText().equals(poistettava)) {
                    jButton.setText("");
                    poistetut++;
                    break;
                }
            }
            if (poistetut >= 2) {
                break;

            }

        }

    }
}
