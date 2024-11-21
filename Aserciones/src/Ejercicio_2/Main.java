/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        try {
            Validar.esPrimo(2);
            Validar.esPrimo(17);
            
            Validar.esPrimo(0);
            Validar.esPrimo(-5);
            
            
        } catch (AssertionError e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
