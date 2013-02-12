/** luo varsinaisen peliruudun jossa peli tapahtuu
 *
 * @param 
 */

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
import java.util.ArrayList;

/**
 *
 *
 *
 * @author AK
 *
 */
public class PeliRuutu implements Runnable {

    private ArrayList<JButton> napit; //a,b,c,d
    private JFrame ruutu;
    private String nimimerkki;
    private JLabel ajastin;
    private JLabel kysymys;
    private String vastaus = null;

    @Override
    public void run() {
        napit = new ArrayList<JButton>();
        this.ruutu = new JFrame(nimimerkki);
        this.ruutu.setPreferredSize(new Dimension(800, 800));
        this.luoRuutu(this.ruutu.getContentPane());
        this.ruutu.pack();
        this.ruutu.setVisible(true);
    }

    /** luo peliruudun, jossa on vastausvaihtoehdot sekä oljenkorret
     *
     * @param 
     */
    private void luoRuutu(Container container) {

        kysymys = new JLabel();
        this.ajastin = new JLabel();

        JButton a = new JButton();
        JButton b = new JButton();
        JButton c = new JButton();
        JButton d = new JButton();

        ActionA actionA = new ActionA(this.vastaus, a);
        ActionB actionB = new ActionB(this.vastaus, b);
        ActionC actionC = new ActionC(this.vastaus, c);
        ActionD actionD = new ActionD(this.vastaus, d);

        a.addActionListener(actionA);
        b.addActionListener(actionB);
        c.addActionListener(actionC);
        d.addActionListener(actionD);

        napit.add(a);
        napit.add(b);
        napit.add(c);
        napit.add(d);

        JButton skippaa = new JButton("Skippaa");
        JButton poistaKaksi = new JButton("Poista kaksi");

        //PoistaKaksi poistakaksi = new POistaKaksi(napit);

        GridLayout layout = new GridLayout(5, 1);
        container.setLayout(layout);
        JPanel oljenkorret = new JPanel();
        GridLayout layout1 = new GridLayout(1, 2);
        oljenkorret.setLayout(layout1);

        oljenkorret.add(skippaa);
        oljenkorret.add(poistaKaksi);

        container.add(kysymys);
        container.add(ajastin);
        container.add(a);
        container.add(b);
        container.add(c);
        container.add(d);
        container.add(oljenkorret);


        //container.add(ajastin);

    }
    /** asettaa kellon, ei toimi
     *
     * @param 
     */
    
    public void setKello(int aika) {
        this.ajastin.setText(Integer.toString(aika));
        this.ruutu.repaint();
    }

    /** asettaa napit
     *
     * @param 
     */
    
    public ArrayList<JButton> napit() {
        return napit;
    }

    public JLabel getKysymys() {
        return kysymys;
    }

    public String getVastaus() {
        if (vastaus != null) {
            String palautettava = vastaus;
            this.vastaus = null;
            return palautettava;
        }
        return vastaus;
    }
}
