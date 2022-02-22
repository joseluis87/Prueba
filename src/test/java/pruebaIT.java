/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ceti
 */
public class pruebaIT {
    
    public pruebaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Suma method, of class prueba.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 1;
        int b = 3;
        int expResult = 4;
        int result = prueba.Suma(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Resta method, of class prueba.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int a = 3;
        int b = 1;
        int expResult = 2;
        int result = prueba.Resta(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Multiplicacion method, of class prueba.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int a = 1;
        int b = 3;
        int expResult = 3;
        int result = prueba.Multiplicacion(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Division method, of class prueba.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int a = 3;
        int b = 3;
        int expResult = 1;
        int result = prueba.Division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }


    
}
