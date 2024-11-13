/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
public class Main {
    public static void main(String[] args){
        CalculadoraDeRaices miCalculadora = new CalculadoraDeRaices();
        Scanner input = new Scanner(System.in);
        double numeroDado = 0;
        
        try {
            
            System.out.println("Ingrese el valor: ");
            numeroDado=input.nextDouble();
            System.out.println("La raiz de "+numeroDado+" es: "+miCalculadora.raizCuadrada(numeroDado));
            
        } catch (InputMismatchException e) {
            System.out.println("No se puede ingresar letras, solo numeros");
        }catch(ExceptionValidarNumeros e){
            System.out.println("Error: "+e.getMessage());
       }

    }
}
