/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion = 0;
        double primerNumero, segundoNumero;
        
        do {            
            System.out.println("----------- MENU DE OPCIONES ---------------");
            System.out.println("1 ------------- SUMA");
            System.out.println("2 ------------- RESTA");
            System.out.println("3 ------------- MULTIPLICACION");
            System.out.println("4 ------------- DIVIZION");
            System.out.println("5 ------------- SALIR");
            System.out.print("Opcion: ");
            try {
                opcion = input.nextInt();
                
                System.out.println("Ingrese el primer numero: ");
                primerNumero = input.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                segundoNumero = input.nextDouble();
                
            } catch (InputMismatchException e) {
                System.out.println("Acaso estas tontito, solo numeros");
                continue;
            }

            if(opcion == 1){
                System.out.println("Suma: "+Calculadora.suma(primerNumero, segundoNumero));
            }
            if(opcion == 2){
                System.out.println("Resta:: "+Calculadora.resta(primerNumero, segundoNumero));
                
            }
            if(opcion == 3){
                System.out.println("Multiplicacion:: "+Calculadora.multiplicacion(primerNumero, segundoNumero));
            }
            if(opcion == 4){
                try {
                    System.out.println("Divizion:: "+Calculadora.dividir(primerNumero, segundoNumero));
                } catch (ArithmeticException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
            if(opcion == 5){
                System.out.println("Adios");
            }
            
            if(opcion < 0 || opcion >5){
                System.out.println("Opcio no valida");
            }
            System.out.println("\n");
        } while(opcion != 5);
        
        
        
    }
}
