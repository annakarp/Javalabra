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
public class ActionA implements ActionListener {

    private String vastaus;
    private JButton a;

    public ActionA(String vastaus, JButton a) {
        this.vastaus = vastaus;
        this.a = a;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.vastaus = a.getText();

    }
}
