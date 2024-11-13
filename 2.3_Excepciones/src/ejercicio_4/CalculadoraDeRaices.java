/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
class ExceptionValidarNumeros extends Exception{
    public ExceptionValidarNumeros(String message){
        super(message);
    }
}


public class CalculadoraDeRaices {
    private double numeroDado;
    public CalculadoraDeRaices() {
        this.numeroDado = 0;
    }
    
    public double raizCuadrada(double numero) throws ExceptionValidarNumeros{
        if(numero < 0){
            throw new ExceptionValidarNumeros("EL numero no puede ser negativo");
        }
        return Math.sqrt(numero);
    }
   
}
