/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author AK
 */
public class ActionB implements ActionListener {

    private String vastaus;
    private JButton b;

    public ActionB(String vastaus, JButton b) {
        this.vastaus = vastaus;
        this.b = b;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.vastaus = b.getText();
    }
}
