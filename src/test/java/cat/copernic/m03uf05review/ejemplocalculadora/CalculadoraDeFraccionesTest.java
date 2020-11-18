/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.ejemplocalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reda
 */
public class CalculadoraDeFraccionesTest {

    private CalculadoraDeFracciones instance;

    public CalculadoraDeFraccionesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicializamos tests ...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizamos tests ... ");
    }

    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(2, 3);
        Fraccion f2 = new Fraccion(2, 3);
        instance = new CalculadoraDeFracciones(f1, f2);
    }

    @After // Cada vez q termina un test
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of suma method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testSuma() {
        assertEquals(new Fraccion(12.0, 9.0), instance.suma());
        // otra manera de hacerlo pero con el assertEquals(double)
        assertEquals(12.0, instance.suma().getNumerador(), 0.001);
        assertEquals(9.0, instance.suma().getDenominador(), 1.0E-3); // 1.0 ^ -3 -> 1 / 1000

    }

    /**
     * Test of resta method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testResta() {
        assertEquals(new Fraccion(5.0 , 9.0), instance.resta());
    }

    /**
     * Test of multiplicacion method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testMultiplicacion() { // Hecho con el AssertEquals(double)
       assertEquals(4.0, instance.multiplicacion().getNumerador(), 0.001);
       assertEquals(9.0, instance.multiplicacion().getDenominador(), 0.001);
    }

    /**
     * Test of division method, of class CalculadoraDeFracciones.
     */
    @Test       
    public void testDivision() {    
         assertEquals(new Fraccion(6.0,6.0), instance.division());
    }

}
