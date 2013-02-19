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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class KysymysLataaja {
    private File tiedosto;

    public KysymysLataaja(String osoite) {
        tiedosto = new File(osoite);
    }
    
    public List<Kysymys> lataa() throws FileNotFoundException {
        List<Kysymys> palautettavatKysymykset = new ArrayList<Kysymys>();
        Scanner tiedostonLukija;
        try {
            tiedostonLukija = new Scanner(tiedosto);
        } catch (Exception e) {
            throw new FileNotFoundException();
       }
        
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String[] osat = rivi.split("&");
            String[] kaupungit = osat[1].split(",");
            ArrayList<String> vastausvaihtoehdot = new ArrayList<String>();
            for(int i = 0; i<kaupungit.length; i++){
                vastausvaihtoehdot.add(kaupungit[i]);
            }
            Kysymys kysymys = new Kysymys(osat[0],vastausvaihtoehdot,vastausvaihtoehdot.get(0));
            palautettavatKysymykset.add(kysymys);
        }
        return palautettavatKysymykset;
    }
}