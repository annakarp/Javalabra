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
public class ActionC implements ActionListener {

    private String vastaus;
    private JButton c;

    public ActionC(String vastaus, JButton c) {
        this.vastaus = vastaus;
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.vastaus = c.getText();
    }
}
