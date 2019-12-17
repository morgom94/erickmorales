package com.erick.morales;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    calculadora calc = new calculadora(3,4);

    @Test
    public void pruebaSuma()
    {
        assertEquals(7,calc.sumar(3,4));
    }
    @Test
    public void pruebaResta()
    {
        assertEquals(-1,calc.restar(3,4));
    }
    @Test
    public void pruebaDivision()
    {
        assertEquals(0,calc.dividir(3,4));
    }    
    @Test
    public void pruebaMultiplicacion()
    {
        assertEquals(12,calc.multiplicar(3,4));
    }
    @Test
    public void pruebaPar()
    {
        assertFalse(calc.esPar(3));
    }
    @Test
    public void pruebaImpar()
    {
        assertTrue(calc.esImpar(3));
    }
}
