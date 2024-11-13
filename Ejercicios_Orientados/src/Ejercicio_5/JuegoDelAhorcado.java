/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Alumnos
 */
public class JuegoDelAhorcado {
    private String palabra;
    private int numeroDeAciertos;
    private String palabraOculta;
    
    private void ocultarPalabra(String palabra){
        this.palabraOculta = palabra.replaceAll("[a-zA-Z]", "_ ");
    }
            
    public JuegoDelAhorcado(String palabra) {
        this.palabra = palabra;
        this.numeroDeAciertos = 0;
        ocultarPalabra(palabra);
        
    }
    
    public void verificarLetra(int posicion, char letraIngresada){
        char letraAValidar = palabra.charAt(posicion);
        
        if(letraAValidar == letraIngresada){
            this.numeroDeAciertos += 1;
            StringBuilder temp = new StringBuilder(palabraOculta);
            temp.setCharAt(posicion+1, letraAValidar);
            this.palabraOculta = temp.toString();
            return ;
        }        
        System.out.println(letraAValidar);
    }
    
    public void mostrarPalabra(){
        System.out.println("Palabra:");
        System.out.println(palabraOculta);
    }
    
    //- - 
}
