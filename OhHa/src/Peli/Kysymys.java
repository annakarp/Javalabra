
package Peli;

import java.util.List;

public class Kysymys {
private String nimi;
private List<String> vastausV;
private String vastaus;

/**
 * luokka Kysymys hallinnoi/luo kysymykset-listalle parametrit
 * @param nimi on varsinainen kysymys, elikkä maa
 * @param vastausV on ylimääräiset kaupungit
 * @param vastaus on oikea kaupunki
 */

    public Kysymys(String nimi, List<String> vastausV, String vastaus) {
    this.nimi = nimi;
    this.vastausV = vastausV;
    this.vastaus = vastaus;
    }
    
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public List<String> getVastausV() {
        return vastausV;
    }
    
    public String getVastausvaihtoehto() {
        int rand =  (int)(Math.random() * ((vastausV.size()-1) + 1));
        
        String palautettavaVaihtoehto = vastausV.get(rand);
        vastausV.remove(rand);
        
        return palautettavaVaihtoehto;
    }

    public void setVastausV(List<String> vastausV) {
        this.vastausV = vastausV;
    }

    public String getVastaus() {
        return vastaus;
    }

    public void setVastaus(String vastaus) {
        this.vastaus = vastaus;
    }
    
}