/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OhHa;
import Peli.Peli;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import OhHa.Kysymysrekisteri;

/**
 *
 *
 *
 * @author AK
 *
 */
public class Pelaa implements ActionListener {
    private JTextField aika;
    private Kysymysrekisteri rekisteri;

    public Pelaa(JTextField aika, Kysymysrekisteri rekisteri) {
        this.aika = aika;
        this.rekisteri = rekisteri;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int rajaAika = Integer.parseInt(aika.getText());
        Peli peli = new Peli(rajaAika, rekisteri);
        peli.run();

    }
}
