/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peli;

import java.awt.event.ActionEvent;
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
public class PeliRuutuTest {
    
    public PeliRuutuTest() {
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
     * Test of luoAloitusValikko method, of class PeliRuutu.
     */
    @Test
    public void testLuoAloitusValikko() {
        System.out.println("luoAloitusValikko");
        PeliRuutu instance = null;
        instance.luoAloitusValikko();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class PeliRuutu.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        PeliRuutu instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AloitaPeli method, of class PeliRuutu.
     */
    @Test
    public void testAloitaPeli() {
        System.out.println("AloitaPeli");
        PeliRuutu instance = null;
        instance.AloitaPeli();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lopetaPeli method, of class PeliRuutu.
     */
    @Test
    public void testLopetaPeli() {
        System.out.println("lopetaPeli");
        PeliRuutu instance = null;
        instance.lopetaPeli();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
