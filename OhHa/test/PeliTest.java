/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import OhHa.Kysymysrekisteri;
import Peli.Peli;
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
public class PeliTest {
    private Peli peli;
    private int rajaaika;
    private Kysymysrekisteri rekisteri;
    
    public PeliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        peli = new Peli(rajaaika, rekisteri);
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
    public void kaynnistaako(){
        try{
            peli.run();
            fail("Exception was not thrown when attemting to run");
        }catch (Exception e){
            assertNotNull(e.getMessage());
        }
    }
}
