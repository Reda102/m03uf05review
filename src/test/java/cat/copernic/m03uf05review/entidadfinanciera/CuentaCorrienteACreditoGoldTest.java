/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

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
public class CuentaCorrienteACreditoGoldTest {

    private CuentaCorritenteImpl instance;

    public CuentaCorrienteACreditoGoldTest() {
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
        instance = new CuentaCorrienteACreditoGold("Mohamed", 1000.0);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    public void testAbona() { //provocamos el error a la hora de retirar 10k €
                              //(no se puede sacar mas del descubierto de 3k€)
        instance.abona(10000.0);
        assertNotEquals(1000.0, instance.getSaldo(), 0.01);
    }

    @Test
    public void testIngresa() {
        instance.ingresa(3000.0);
        assertNotEquals(2000.0, instance.getSaldo(), 0.01);   
    }

}
