/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.miprimerprograma;

import java.math.BigDecimal;

/**
 *
 * @author TraianDida
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("La suma de enteros es " + calculadora.suma(2, 2));
        System.out.println("El resultado de la suma con decimales es: " + 
                calculadora.suma(new BigDecimal("1.505"), new BigDecimal("1.440")));
        
    }
}
