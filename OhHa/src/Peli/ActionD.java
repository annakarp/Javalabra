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
public class ActionD implements ActionListener {

    private String vastaus;
    private JButton d;

    public ActionD(String vastaus, JButton d) {
        this.vastaus = vastaus;
        this.d = d;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.vastaus = d.getText();
    }
}
