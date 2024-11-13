/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUES: SAN JACINTO
 */

class ExcepcionValorNumerico extends Exception{
    public ExcepcionValorNumerico(String mensaje){
        super(mensaje);
    }
}


public class ConversorDeTemperatura {
    public static double obtenerValor(Scanner input, String unidad) throws ExcepcionValorNumerico{
        try {
            System.out.println("Ingrese temperatura en "+unidad+" : ");
            double valor = input.nextDouble();
            return valor;
        } catch (InputMismatchException e) {
            throw new ExcepcionValorNumerico("error valor no valido\nSOLO NUMEROS...");
        }
    }
    
    public static double celciusAFahrenheit(double valorCelcius){
        return (valorCelcius * 9/5)+32;
    }
    
    public static double fahrenheitACelcius(double valorFahrenheit){
        return (valorFahrenheit -32) * 5/9;
    }
    
}
