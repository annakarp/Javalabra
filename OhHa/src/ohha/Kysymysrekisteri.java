/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author annakarp
 */
public class Kysymysrekisteri {
     private HashMap<String, String> kysymysVastaus;
     private File tiedosto;
    
    
            
    public Kysymysrekisteri(String tiedosto){
        this.tiedosto = new File(tiedosto);
        kysymysVastaus = new HashMap<String, String>();
    }
    
    public Kysymysrekisteri() {
        
        kysymysVastaus = new HashMap<String, String>();
        this.tiedosto = new File("rekisteri.txt");
    }
    
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
            this.kysymysVastaus.put(osat[0], osat[1]);
        }
        return true;
    }
    
    
    public void lisaa(String maa, String paakaupunki){
        if (kysymysVastaus.get(maa) == null) {
            kysymysVastaus.put(maa, paakaupunki);

        }
        
    
    }
    public boolean loytyykoMaa(String maa){
        return kysymysVastaus.containsKey(maa);
        
    }    
    public boolean loytyykoKaupunki(String kaupunki){
        return kysymysVastaus.containsValue(kaupunki);
    }


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
    public void uusiKysymys(){
        arvoMaa();
    }
    
    public String arvoMaa(){
        Random random = new Random();
        List<String>maat = new ArrayList<String>(kysymysVastaus.keySet());
        String maa = maat.get( random.nextInt(maat.size()) );
        return maa;
    }
}
