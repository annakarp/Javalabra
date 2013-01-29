/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import OhHa.Kysymysrekisteri;
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
public class KysymysrekisteriTest {
    private Kysymysrekisteri rekisteri;
    
    public KysymysrekisteriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    
    
    
    @Before
    public void setUp() {
        rekisteri = new Kysymysrekisteri();
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
    public void toimiikoLisaysMaille(){
        rekisteri.lisaa("Kiina", "Peking");
        assertTrue(rekisteri.loytyykoMaa("Kiina"));
    }    
    
    @Test
    public void toimiikoLisaysKaupungeille(){
        rekisteri.lisaa("Kiina", "Peking");
        assertTrue(rekisteri.loytyykoKaupunki("Peking"));
    }
    
    @Test
    public void toimiikoLataus(){
        assertTrue(rekisteri.lataa());
    }
    
    @Test
    public void toimiikoTallennus(){
        assertTrue(rekisteri.tallenna());
    }
    
    @Test
    public void toimiikoArpominen(){
        assertTrue(!rekisteri.arvoMaa().isEmpty());
    }
    @Test
    public void palauttaaKysymykset(){
        assertTrue(!rekisteri.getKysymykset().isEmpty());
    }
}
