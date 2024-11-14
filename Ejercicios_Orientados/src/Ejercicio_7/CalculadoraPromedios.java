/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

import java.util.List;

/**
 *
 * @author luisd
 */
public class CalculadoraPromedios {
    
    public static double calcularPromedio(List<String> listaNumeros){
        
        if(listaNumeros == null){
            throw new NullPointerException("La lista no puede ser nula");
        }
        
        if(listaNumeros.isEmpty()){
            throw new ArithmeticException("La lista esta vacia");
        }
        
        double suma = 0;
        boolean error = false;
        
        for(String numero:listaNumeros){
            try {
                suma += Double.parseDouble(numero);
            } catch (NumberFormatException e) {
                System.out.println("No es un numero: "+numero);
                error = true;
                break;
            }
        }
        
        double promedio = suma / listaNumeros.size();
        
        if(error){
            promedio = 0;
            throw new NumberFormatException("La lista solo debe de contener numeros");
        }
        
        return promedio;
    }
    
    
}
