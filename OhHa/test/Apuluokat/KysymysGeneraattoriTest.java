/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuluokat;

import Peli.Kysymys;
import java.util.ArrayList;
import java.util.List;
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
public class KysymysGeneraattoriTest {
    ArrayList<Kysymys> kysymykset;
    Kysymys kysymys;
    String nimi;
    ArrayList<String> vastausv;
    String vastaus;
    
    public KysymysGeneraattoriTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kysymykset = new ArrayList<Kysymys>();
        vastausv = new ArrayList<String>();
        vastausv.add("jee");
        kysymys = new Kysymys(nimi,vastausv,vastaus);
        
    }
    
    @After
    public void tearDown() {
    }

   

        @Test
        public void onkoKysymyksetLoppu() {
            kysymykset.add(kysymys);
            assertTrue(!kysymykset.isEmpty());
    }
}
