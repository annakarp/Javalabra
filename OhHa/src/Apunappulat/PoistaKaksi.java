/** luokka poistaa kaksi väärää kaupunkivaihtoehtoa peliruudulta
 *
 * @param 
 */



/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package Apunappulat;

import Peli.Kysymys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 *
 *
 * @author AK
 *
 */
public class PoistaKaksi implements ActionListener {
    private Kysymys kysymys;
    private ArrayList<JButton> napit;

    public PoistaKaksi(Kysymys kysymys, ArrayList<JButton> napit) {
        this.kysymys = kysymys;
        this.napit = napit;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.kysymys.poistaKaksiVaaraa(this.napit);

    }
}
