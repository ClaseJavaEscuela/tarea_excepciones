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
public class Main {

    public static void main(String[] args) throws ExcepcionValorNumerico {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        double valorDeTemperatura = 0;

        do {
            System.out.println("------------- MENU DE OPCIONES ---------");
            System.out.println("1. -------------- Convertir de Celsius a Fahrenheit");
            System.out.println("2. -------------- Convertir de Fahrenheit a Celsius");
            System.out.println("3. -------------- Salir");
            System.out.println("opcion: ");

            try {
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nSOLO SE ACEPTAN NUMEROS...\n");
                input.nextLine();
            }
                     
            if(opcion == 1){
                try {
                    valorDeTemperatura = ConversorDeTemperatura.obtenerValor(input, "Celcius");  
                    System.out.println("Resultado: "+ConversorDeTemperatura.celciusAFahrenheit(valorDeTemperatura));
                } catch (ExcepcionValorNumerico e) {
                    System.out.println("Error: "+e.getMessage());
                    input.nextLine();
                }  
                
            }
            
            if(opcion == 2){
                try {
                    valorDeTemperatura = ConversorDeTemperatura.obtenerValor(input, "Fahrenheit");
                    System.out.println("Resultado: "+ConversorDeTemperatura.fahrenheitACelcius(valorDeTemperatura));
                } catch (ExcepcionValorNumerico e) {
                    System.out.println("Error: "+e.getMessage());
                    input.nextLine();
                }
                
            }
            if (opcion < 0 || opcion > 3) {
                System.out.println("Opcion no valida");
            }
            opcion = 0;
        } while (opcion != 5);

        System.out.println("FIN DEL PROGRAMA ...");

    }
}
