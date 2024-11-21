/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Alumnos
 */
public class Ciclo {
    public static int calcularSuma(int[] numeros){
        int suma = 0;
        
        assert numeros != null: "El arreglo se encuentra vacio";
        
        for(int numero: numeros){
            assert numero >= 0:"El numero [ "+numero+" ] no es un valor positivo";
            suma += numero;
        }
        return suma;
    }
}
