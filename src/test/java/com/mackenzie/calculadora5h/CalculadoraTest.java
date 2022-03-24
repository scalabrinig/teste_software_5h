/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackenzie.calculadora5h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gustavo
 */
public class CalculadoraTest {
    
    Calculadora calc;
    
    public CalculadoraTest() {
        calc = new Calculadora();
    }

    @Test
    public void testSomar() {
        System.out.println("TestSomar");
        assertEquals(2.0, calc.somar(1.0, 1.0));
        assertEquals(10.2, calc.somar(5.1, 5.1));
        assertEquals(32.5, calc.somar(16.2, 16.3));
        assertNotEquals(2.0, calc.somar(1.0, 2.0));
        assertNotEquals(10.2, calc.somar(1.9, 2.4)); 
        assertNotEquals(22.22, calc.somar(11.11, 5.4)); 
    }

    @Test
    public void testSubtrair() {
        System.out.println("testSubtrair");
        assertEquals(2.0, calc.subtrair(3.0, 1.0));
        assertEquals(10.2, calc.subtrair(15.4, 5.2));
        assertEquals(32.5, calc.subtrair(58.9, 26.4));
        assertNotEquals(6.0, calc.subtrair(9.0, 3.1));
        assertNotEquals(5.8, calc.subtrair(99.7, 150.5)); 
        assertNotEquals(22.22, calc.subtrair(64.11, 25.58)); 
    }

    @Test
    public void testMultiplicar() {
        System.out.println("testMultiplicar");
        assertEquals(2.0, calc.multiplicar(2.0, 1.0));
        assertEquals(10.2, calc.multiplicar(2.0, 5.1));
        assertEquals(32.6, calc.multiplicar(8.15, 4.0));
        assertNotEquals(6.0, calc.multiplicar(3.0, 2.1));
        assertNotEquals(5.7, calc.multiplicar(100.7, 2.45)); 
        assertNotEquals(49.7, calc.multiplicar(4.58, 5.8)); 
    }

    @Test
    public void testDividir() {
        System.out.println("testDividir");
        assertEquals(2.0, calc.dividir(4.0, 2.0));
        assertEquals(9.78, calc.dividir(48.9, 5.0));
        assertEquals(48.3, calc.dividir(170.982, 3.54));
        assertNotEquals(6.1, calc.dividir(12.0, 2.0));
        assertNotEquals(48.7, calc.dividir(100.7, 5.87)); 
        assertNotEquals(29.47, calc.dividir(4.7, 1.87));
    }
    
}
