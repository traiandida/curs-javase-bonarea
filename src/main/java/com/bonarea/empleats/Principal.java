/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.empleats;

//Crear una clase con 3 atributos
// nombre, apellidos y sueldo - float

// Crear una clase Principal con el metodo main
// En el metodo main crear un array de 5 empleados y con un bucle for each
// calcular el sueldo total de todos los empleados.


/**
 *
 * @author TraianDida
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Empleat empleats[] = new Empleat[5];
        
        empleats[0] = new Empleat("Fernando","Alonso",2405.23f);
        empleats[1] = new Empleat("Lewis","Hamilton",5864.98f);
        empleats[2] = new Empleat("Daniel","Ricciardo",1832.00f);
        empleats[3] = new Empleat("Charles","Leclerc",2130.52f);
        empleats[4] = new Empleat("Max","Verstappen",5230.12f);
        
        float suma = 0;
        for (Empleat e : empleats){
            suma += e.sueldo;
        }
        
        System.out.println("El sueldo total de los empleados és: "+suma);
        
        
        
    }
    
}
