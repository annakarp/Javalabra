/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OhHa;

import java.util.*;
import java.io.File;
import java.io.FileWriter;

/**
 *
 *
 *
 * @author annakarp
 *
 */
public class Kysymysrekisteri {

    private HashMap<String, HashMap<String, ArrayList<String>>> kysymysVastaus;
    private File tiedosto;

    public Kysymysrekisteri(String tiedosto) {
        this.tiedosto = new File(tiedosto);
        kysymysVastaus = new HashMap<String, HashMap<String, ArrayList<String>>>();
    }

    public Kysymysrekisteri() {
        kysymysVastaus = new HashMap<String, HashMap<String, ArrayList<String>>>();

        this.tiedosto = new File("src/OhHa/rekisteri");
        


    }

    /** lataa kysymysrekisterin
     *
     * @param 
     */
    
    public boolean lataa() {
        Scanner tiedostonLukija;
        try {
            tiedostonLukija = new Scanner(tiedosto);
        } catch (Exception e) {
            return false;
        }
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String[] osat = rivi.split(":");
            String[] kaupungit = osat[1].split("&");
            ArrayList<String> vastausvaihtoehdot = new ArrayList<String>();
            for (int i = 1; i < kaupungit.length; i++) {
                vastausvaihtoehdot.add(kaupungit[i]);
            }
            HashMap<String, ArrayList<String>> kaupunki = new HashMap<String, ArrayList<String>>();
            kaupunki.put(kaupungit[0], vastausvaihtoehdot);
            kysymysVastaus.put(osat[0], kaupunki);
        }
        return true;
    }

//  public void lisaa(String maa, String paakaupunki){
//      if (kysymysVastaus.get(maa) == null) {
//      kysymysVastaus.put(maa, paakaupunki);
// }
// }
    public boolean loytyykoMaa(String maa) {
        return kysymysVastaus.containsKey(maa);
    }

    public boolean loytyykoKaupunki(String kaupunki) {
        return kysymysVastaus.containsValue(kaupunki);
    }

    
    /** tallentaa kysymysrekisterin
     *
     * @param 
     */
    
    public boolean tallenna() {
        FileWriter kirjoittaja;
        try {
            kirjoittaja = new FileWriter(tiedosto);
            String rivit = "";
            for (String string : kysymysVastaus.keySet()) {
                rivit = rivit + string + ":" + kysymysVastaus.get(string) + "\n";
            }
            kirjoittaja.write(rivit);
            kirjoittaja.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

//  public void uusiKysymys(){
//      arvoMaa();
// }
//
    
    
    /** arpoo maan eli uuden kysymyksen
     *
     * @param 
     */
    
    public String arvoMaa() {
        Random random = new Random();
        List<String> maat = new ArrayList<String>(kysymysVastaus.keySet());
        String maa = maat.get(random.nextInt(maat.size()));
        return maa;
    }

    public HashMap<String, ArrayList<String>> vaihtoehdot(String maa) {
        return this.kysymysVastaus.get(maa);
    }

    public String paakaupunki(String maa) {
        for (String string : this.kysymysVastaus.get(maa).keySet()) {
            return string;
        }
        return null;
    }

    public ArrayList<String> vaihtoehdot(String maa, String paakaupunki) {
        return this.kysymysVastaus.get(maa).get(paakaupunki);
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> getKysymykset() {
        return this.kysymysVastaus;
    }
}
