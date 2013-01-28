/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 *
 *
 * @author AK
 *
 */
public class PeliRuutu implements Runnable {
    private JFrame ruutu;
    private String nimimerkki;
    private JLabel ajastin;

    @Override
    public void run() {
        this.ruutu = new JFrame(nimimerkki);
        this.ruutu.setPreferredSize(new Dimension(800, 800));
        this.luoRuutu(this.ruutu.getContentPane());
        this.ruutu.pack();
        this.ruutu.setVisible(true);
    }

    private void luoRuutu(Container container) {
        JLabel kysymys = new JLabel();
        this.ajastin = new JLabel();
        
         JButton a = new JButton();
         JButton b = new JButton();
         JButton c = new JButton();
         JButton d = new JButton();

         JButton skippaa = new JButton();
         JButton poistaKaksi = new JButton();

         GridLayout layout = new GridLayout(1,5);
         JPanel oljenkorret = new JPanel();
         GridLayout layout1 = new GridLayout(2,1);

         oljenkorret.add(skippaa);
         oljenkorret.add(poistaKaksi);

         container.add(kysymys);
         container.add(ajastin);
         container.add(a);
         container.add(b);
         container.add(c);
         container.add(d);
         container.add(oljenkorret);
         

        container.add(ajastin);

    }

    public void setKello(int aika) {
        this.ajastin.setText(Integer.toString(aika));
        this.ruutu.repaint();
    }
}
