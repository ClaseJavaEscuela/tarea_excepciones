/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_1;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        int porcentaje = 105; // Cambia este valor para probar

 // Verificar que el porcentaje esté entre 0 y 100
        assert porcentaje >= 0 && porcentaje <= 100 : "Porcentaje fuera de rango: " +
       porcentaje;

        System.out.println("El porcentaje es válido: " + porcentaje);
    }
}
