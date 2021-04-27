/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.miprimerprograma;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author TraianDida
 */
public class CalculadoraTest {
    
    Calculadora calculadora = new Calculadora();
    
    @Test
    void testSuma(){
        assertEquals(2,calculadora.suma(1,1));
    }
    
    @Test 
    void testSumaFloat(){
      assertEquals(5.50, calculadora.suma(2.10f, 3.40f));
    }
    
    @Test
    public void testSumaDecimalTest(){
        BigDecimal resultado = new BigDecimal("2.94");
        assertEquals(0, calculadora.suma(new BigDecimal(1.505), 
                new BigDecimal(1.440)).compareTo(resultado));
    }
}
