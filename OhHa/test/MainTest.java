/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Main.Main;
import OhHa.Menu;
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
public class MainTest {
    private Menu menu;
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        menu = new Menu();
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
    public void kaynnistyyko(){
        try{
            menu.run();
            fail("Exception was not thrown when attepting to run");
        }catch (Exception e){
            assertNotNull(e.getMessage());
        }
    }
}
