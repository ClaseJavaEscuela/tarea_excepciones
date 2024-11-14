/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            List<String> primeraLista = new ArrayList<>(Arrays.asList("1","2","4"));
            double promedio = CalculadoraPromedios.calcularPromedio(primeraLista);
            System.out.println("Promedio: "+promedio);
            
            List<String> segundaLista = new ArrayList<>(Arrays.asList("1","h","2"));
            promedio = CalculadoraPromedios.calcularPromedio(segundaLista);
            System.out.println("Promedio: "+promedio);
             
        }catch (NumberFormatException e) {
            System.out.println("Error: La lista solo debe de contener numeros");
        }catch (NullPointerException e) {
            System.out.println("Error: "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
       
        
    }
   
    
}
