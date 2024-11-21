/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Alumnos
 */
public class CalcularArea {
    public static int calcularArea(int largo, int ancho){
        assert largo > 0 && ancho>0: "Las dos dimensiones deben ser positivas";
        return largo * ancho;
    }
}
