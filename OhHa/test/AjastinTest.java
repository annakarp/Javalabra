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
       try{
            ajastin.nollaa();
            fail("Exception was not thrown");
        }catch (Exception e){
            assertNotNull(e.getMessage());
        }
        
    }
    
    @Test
    public void onkoAikaaJaljella(){
        if(aika<rajaaika){
            assertTrue(ajastin.getAikaaJaljella());
        }
    }
    
    @Test
    public void kaynnistaako(){
        try{
            ajastin.run();
            fail("Exception was not thrown when attemting to run");
        }catch (Exception e){
            assertNotNull(e.getMessage());
        }
    }
}

