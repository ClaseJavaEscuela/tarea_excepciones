/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
public class Calculadora {
    private int primerNumro;
    private int segundoNumero;

    public Calculadora(){
        primerNumro = 0;
        segundoNumero = 0;
    }
    public Calculadora(int primerNumro, int segundoNumero) {
        this.primerNumro = primerNumro;
        this.segundoNumero = segundoNumero;
    }
    
    public void dividir(int primerNumero, int segundoNumero){
        try {
            int resultado =(primerNumero / segundoNumero);
        } catch (ArithmeticException e) {
            System.out.println("Erro: No puedes dividir por cero");
        }
    }
    
}
