/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        try {
            int[] numeros = {1,2,3,4,5,-6};
            int sumaTotal = Ciclo.calcularSuma(numeros);
            System.out.println("Suma total: "+sumaTotal);
        } catch (AssertionError e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
