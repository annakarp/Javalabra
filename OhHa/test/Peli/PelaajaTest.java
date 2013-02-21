/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

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
public class PelaajaTest {
    
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNimimerkki method, of class Pelaaja.
     */
    @Test
    public void testGetNimimerkki() {
        System.out.println("getNimimerkki");
        Pelaaja instance = null;
        String expResult = "";
        String result = instance.getNimimerkki();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPisteet method, of class Pelaaja.
     */
    @Test
    public void testGetPisteet() {
        System.out.println("getPisteet");
        Pelaaja instance = null;
        int expResult = 0;
        int result = instance.getPisteet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kasvataPisteita method, of class Pelaaja.
     */
    @Test
    public void testKasvataPisteita() {
        System.out.println("kasvataPisteita");
        int aikaajaljella = 0;
        Pelaaja instance = null;
        instance.kasvataPisteita(aikaajaljella);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPisteet method, of class Pelaaja.
     */
    @Test
    public void testSetPisteet() {
        System.out.println("setPisteet");
        int pisteet = 0;
        Pelaaja instance = null;
        instance.setPisteet(pisteet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
