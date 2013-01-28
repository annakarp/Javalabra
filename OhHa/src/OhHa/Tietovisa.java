/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OhHa;

/**
 *
 *
 *
 * @author annakarp
 *
 */
public class Tietovisa {
    private String nimimerkki;
    private Kysymysrekisteri rekisteri;

    public Tietovisa(String nimimerkki) {
        this.nimimerkki = nimimerkki;
        rekisteri = new Kysymysrekisteri();

    }

    public boolean lataaKysymysrekisteri() {
        return rekisteri.lataa();
    }

    public void kaynnista() {
        rekisteri.uusiKysymys();

//ajastin.aloita();

    }
}
