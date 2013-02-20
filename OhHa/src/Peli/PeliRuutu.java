/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

import Apuluokat.KysymysGeneraattori;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author AK
 */
public class PeliRuutu implements ActionListener {

    JLabel ajastinLabel;
    Timer ajastin;
    Kysymys kysymys;
    KysymysGeneraattori generaattori;
    private Pelaaja pelaaja;
    private JFrame ruutu;
    private JTextField nimim;
    private ArrayList<JButton> napit; // a,b,c,d

    public PeliRuutu(KysymysGeneraattori generaattori) {
        this.generaattori = generaattori;
        luoAloitusValikko();
    }

    public void luoAloitusValikko() {
        this.ruutu = new JFrame("Pääkaupunkivisa");
        this.ruutu.setPreferredSize(new Dimension(400, 200));
        this.ruutu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoRuutu(ruutu.getContentPane());
        this.ruutu.pack();
        this.ruutu.setVisible(true);
    }
    
   

    private void luoRuutu(Container container) {
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JLabel nimimerkki = new JLabel("Nimimerkki");
        JLabel vastausaika = new JLabel("Vastausaika per kysymys");

        nimim = new JTextField();
        //miten asettaa luokkamuuttuja nick textikentän nimim mukaan ?JTextfieldin javadoccareista löytyy sen metodin nimi, joka palauttaa sen arvon.. joku getValue tjsp.
        //nimim.addActionListener(this);
        JLabel aika = new JLabel("10sec");

        JLabel huippupisteet = new JLabel("");
        JButton pelaa = new JButton("Pelaa!");

        pelaa.addActionListener(this);

        container.add(nimimerkki);
        container.add(nimim);

        container.add(vastausaika);
        container.add(aika);

        container.add(huippupisteet);
        container.add(pelaa);
    }

    //nappien toiminnallisuudet
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Pelaa!")) {
            this.pelaaja = new Pelaaja(nimim.getText());
            AloitaPeli();
        }
        if (ae.getActionCommand().equals("Skippaa")) {
            if (generaattori.kysymyksetLoppu()) {
                lopetaPeli();
            } else {
                AloitaPeli();
            }
        }

    }

    public void AloitaPeli() {
        if (generaattori.kysymyksetLoppu()) {
            lopetaPeli();
            return;
        }
        this.ruutu.dispose();
        this.ruutu = new JFrame("Pääkaupunkivisa");
        this.ruutu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoPeliruutu(this.ruutu.getContentPane());
        this.ruutu.pack();
        this.ruutu.setVisible(true);
    }

    private void luoPeliruutu(Container container) {
        this.ruutu.setPreferredSize(new Dimension(800, 800));
        kysymys = generaattori.generoiKysymys();

        JLabel kyssari = new JLabel(kysymys.getNimi());
        ajastinLabel = new JLabel("10");

        if (ajastin != null) {
            ajastin.removeActionListener(ajastin.getActionListeners()[0]);
        }

        ajastin = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int seconds = Integer.parseInt(ajastinLabel.getText());
                seconds--;
                if (seconds == 0) {
                    ajastinLabel.setText("10");
                    AloitaPeli();
                } else {
                    ajastinLabel.setText("" + seconds);
                }
            }
        });
        ajastin.start();

        ArrayList<JButton> buttonit = generoiVastausvaihtoehdot((int) (Math.random() * (3 + 1)));

        JButton a = buttonit.get(0);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(kysymys.getVastaus())) {
                    pelaaja.kasvataPisteita(Integer.parseInt(ajastinLabel.getText()));
                    AloitaPeli(); 
                }
            }
        });
        JButton b = buttonit.get(1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(kysymys.getVastaus())) {
                    pelaaja.kasvataPisteita(Integer.parseInt(ajastinLabel.getText()));
                    AloitaPeli(); 
                }
            }
        });

        JButton c = buttonit.get(2);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(kysymys.getVastaus())) {
                    pelaaja.kasvataPisteita(Integer.parseInt(ajastinLabel.getText()));
                    AloitaPeli(); 
                }
            }
        });

        JButton d = buttonit.get(3);

        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(kysymys.getVastaus())) {
                    pelaaja.kasvataPisteita(Integer.parseInt(ajastinLabel.getText()));
                    AloitaPeli(); 
                }
            }
        });

        JButton skippaa = new JButton("Skippaa");
        skippaa.addActionListener(this);
        

        GridLayout layout = new GridLayout(5, 1);
        container.setLayout(layout);
        JPanel oljenkorret = new JPanel();
        GridLayout layout1 = new GridLayout(1, 2);
        oljenkorret.setLayout(layout1);

        oljenkorret.add(skippaa);
        container.add(kyssari);

        container.add(ajastinLabel);

        container.add(a);
        container.add(b);
        container.add(c);
        container.add(d);

        container.add(oljenkorret);
    }

    private ArrayList<JButton> generoiVastausvaihtoehdot(int oikeanVastauksenIndeksi) {
        ArrayList<JButton> list = new ArrayList<JButton>();
        boolean vastausGeneroitu = false;

        for (int i = 0; i < 4; i++) {
            String vastausvaihtoehto = kysymys.getVastausvaihtoehto();
            if (vastausvaihtoehto.equals(kysymys.getVastaus())) {
                vastausGeneroitu = true;
            }
            JButton nappula = new JButton(vastausvaihtoehto);
            list.add(nappula);
        }
        if (!vastausGeneroitu) {
            JButton nappula = new JButton(kysymys.getVastaus());
            list.remove(oikeanVastauksenIndeksi);
            list.add(oikeanVastauksenIndeksi, nappula);
        }
        return list;
    }

    public void lopetaPeli() {
        //System.out.println("Nimimerkki: " + pelaaja.getNimimerkki() + "\n" + "Pisteet: " + pelaaja.getPisteet());
        naytaTulokset();
    }
    
    private void naytaTulokset() {
        TulosManageri tulosmanageri = new TulosManageri();
        
        this.ruutu.dispose();
        this.ruutu = new JFrame("Tuloksesi");
        this.ruutu.setPreferredSize(new Dimension(400, 200));
        this.ruutu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoLoppuRuutu(ruutu.getContentPane());
        this.ruutu.pack();
        this.ruutu.setVisible(true);
        ajastin.stop();
        
    }
    
     private void luoLoppuRuutu(Container container){
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JLabel nimimerkki = new JLabel("Nimimerkkisi:");
        JLabel vastausaika = new JLabel("Pisteesi:");
        
        JLabel nick = new JLabel(pelaaja.getNimimerkki());
        JLabel aika = new JLabel(pelaaja.getPisteet()+ "");
        
        container.add(nimimerkki);
        container.add(nick);

        container.add(vastausaika);
        container.add(aika);

    }
}
