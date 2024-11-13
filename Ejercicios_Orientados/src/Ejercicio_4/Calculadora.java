/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author luisd
 */
public class Calculadora {
    public static double dividir(double diviendo, double divizor){
        if(divizor == 0){
            throw new ArithmeticException("Que cres chavo no se puede dividir por cero");
        }
        return diviendo / divizor;
    }
    
    public static double multiplicacion(double primerNumero,double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public static double resta(double primerNumero,double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public static double suma(double primerNumero,double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    
}
