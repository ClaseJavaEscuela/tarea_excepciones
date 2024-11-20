/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author Alumnos
 */
public class Busquedas {
    private boolean validarArreglo(int[] arreglo, int clave){
        assert arreglo.length > 0:"El arreglo esta vacio";
        return true;
    }
    public static int busquedaBinaria(int[] arreglo, int clave){
        int inicio = 0;
        int fin = arreglo.length -1;
        
        while(inicio <= fin){
            int medio = (inicio +fin)/2;
            if(arreglo[medio] == clave){
                
            }else if(arreglo[medio] < clave){
                inicio = medio -1;
            }else{
                fin = medio -1;
            }
        }
        
        return -1;
    }
}
