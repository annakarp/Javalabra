/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Peli.Ajastin;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author annakarp
 */
public class AjastinTest {
    private int aika;
    private int rajaaika;
    private Ajastin ajastin;
    private JLabel kello;
    
    public AjastinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kello = kello;
        aika = 10;
        rajaaika = 15;
        ajastin = new Ajastin(rajaaika, kello);
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void nollaakoAjastimen(){
       aika = 10;
       ajastin.nollaa();
       
       assertEquals(0, 0);
    }
    
    @Test
    public void onkoAikaaJaljella(){
        if(aika<rajaaika){
            assertTrue(ajastin.getAikaaJaljella());
        }
    }
    
//    @Test
//    public void kaynnistaako(){
//        
//    }
}

