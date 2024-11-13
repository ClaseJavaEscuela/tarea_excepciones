/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
public class Main {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el primer numero: ");
            int primerNumero = input.nextInt();
            
            System.out.println("Ingrese el segundo numero");
            int segundoNumero =  input.nextInt();
            
            miCalculadora.dividir(primerNumero, segundoNumero);
            
        } catch (InputMismatchException e) {
            
            System.out.println("Estas medio tontito verdad, o porque escribes una letra y no un numero");
        }
        
    }
}
