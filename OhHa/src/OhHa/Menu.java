/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OhHa;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import OhHa.Kysymysrekisteri;

/**
 *
 *
 *
 * @author AK
 *
 */
public class Menu implements Runnable {

    private JFrame ruutu;

    @Override
    public void run() {
        Kysymysrekisteri rekisteri = new Kysymysrekisteri();
        this.ruutu = new JFrame("Pääkaupunkivisa");
        this.ruutu.setPreferredSize(new Dimension(400, 200));
        this.ruutu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.luoRuutu(this.ruutu.getContentPane(), rekisteri);
        this.ruutu.pack();
        this.ruutu.setVisible(true);

    }

    private void luoRuutu(Container container, Kysymysrekisteri rekisteri) {
        GridLayout layout = new GridLayout(3, 2);

        container.setLayout(layout);

        JLabel nimimerkki = new JLabel("Nimimerkki");
        JLabel vastausaika = new JLabel("Vastausaika");

        JTextField n = new JTextField();
        JTextField a = new JTextField();

        JButton huippupisteet = new JButton("Pistelista");
        JButton pelaa = new JButton("Pelaa!");

        Pelaa pelaaAction = new Pelaa(a, rekisteri);
        pelaa.addActionListener(pelaaAction);

        container.add(nimimerkki);
        container.add(n);
        container.add(vastausaika);
        container.add(a);
        container.add(huippupisteet);
        container.add(pelaa);

    }
}
