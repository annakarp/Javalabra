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
public class TietovisaTest {
    private Kysymysrekisteri rekisteri;
    
    public TietovisaTest() {
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
    public void lataakoKysymysrekisterin(){
        assertTrue(rekisteri.lataa());
    }
    
    @Test
    public void kaynnistaako(){
        try{
            rekisteri.uusiKysymys();
            fail("Exception was not thrown when attepting to load new question");
        }catch (Exception e){
            assertNotNull(e.getMessage());
        }
    }
}
