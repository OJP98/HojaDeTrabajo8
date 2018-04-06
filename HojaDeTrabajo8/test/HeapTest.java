/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillermo Sandoval
 */
public class HeapTest {
    
    public HeapTest() {
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
     * Test of add method, of class Heap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Paciente ejemplo= new Paciente("Nombre", "critico", "A");
        Heap instance = new Heap();
        instance.add(ejemplo);

    }

    /**
     * Test of atenderPaciente method, of class Heap.
     */
    @Test
    public void testAtenderPaciente() {
        System.out.println("atenderPaciente");
        Heap instance = new Heap();
        String expResult = "No hay pacientes que atender";
        String result = instance.atenderPaciente();
        assertEquals(expResult, result);
    }
    
}
