/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args){
       JuegoDelAhorcado juego = new JuegoDelAhorcado("hola");
       
       juego.mostrarPalabra();
       juego.verificarLetra(0,'h');
       juego.mostrarPalabra();
       juego.verificarLetra(1,'o');
       juego.mostrarPalabra();
       juego.verificarLetra(2,'l');
       juego.mostrarPalabra();
       juego.verificarLetra(3,'a');
       juego.mostrarPalabra();
    }
}
