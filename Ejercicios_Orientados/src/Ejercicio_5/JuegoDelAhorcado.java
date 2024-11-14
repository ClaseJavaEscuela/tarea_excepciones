/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author Alumnos
 */
public class JuegoDelAhorcado {
    private String palabra;
    private int numeroDeAciertos;
    private String palabraOculta;
    private int numeroErrores;
    private int numeroIntentos = 7;
    private boolean juegoTerminado;
    private List<String> palabras;
    
    private void ocultarPalabra(String palabra){
        this.palabraOculta = palabra.replaceAll("[a-zA-Z]", "_ ");
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }
            
    public JuegoDelAhorcado() {
        this.palabra = palabra;
        this.numeroDeAciertos = 0;
        this.numeroErrores = 0;
        this.juegoTerminado = true;
        this.palabras = new ArrayList<>(Arrays.asList("hola","celular","teclado","computadora"));
    }
    public void inicarJuego(){
        this.numeroDeAciertos = 0;
        this.numeroErrores = 0;
        this.juegoTerminado = false;
        
        Random random = new Random();
        int randomItem = random.nextInt(palabras.size());
        setPalabra(palabras.get(randomItem));
        ocultarPalabra(palabra);
        
    }
    public void finalizarJuego(){
        if(this.numeroDeAciertos == palabra.length()){
            System.out.println("\nHas ganado !!\n");
            this.juegoTerminado = true;
        }
        if(this.numeroErrores == this.numeroIntentos){
            System.out.println("\nHas perdido\n");
            this.juegoTerminado = true;
        }
        
    }
    
    public void validarCaracter(char caracter){
        String regex = "^[a-zA-Z]+$";
        String cadena = Character.toString(caracter);
        if(!Pattern.matches(regex, cadena)){
            throw new IllegalArgumentException("La letra no puede ser un numero y simbolos especiales");
        }
        return;
    }
    
    public boolean verificarLetra(int posicion, char letraIngresada){
        if(posicion > this.palabra.length()){
            throw new ArrayIndexOutOfBoundsException("La posicion excede la longitud de la palabra");
        }
        char letraAValidar = this.palabra.charAt(posicion-1);
        
        
        
        if(letraAValidar == letraIngresada){
            this.numeroDeAciertos += 1;
            StringBuilder temp = new StringBuilder(palabraOculta);
            if(posicion == 1){
                temp.setCharAt(posicion-1, letraAValidar);
            }else{
                temp.setCharAt((posicion-1)*2, letraAValidar);
            }
            System.out.println("correcto!!");
            this.palabraOculta = temp.toString();
            return true;
        }
        
        this.numeroErrores += 1;
        System.out.println("letra incorecta!!");
        return false;
    }
    
    public void mostrarInfo(){
        System.out.println("\nPalabra:");
        System.out.println(palabraOculta);
        System.out.println("Letras acertadas: "+numeroDeAciertos);
        System.out.println("Letras restantes: "+ (palabra.length()-this.numeroDeAciertos) );
        System.out.println("Intentos restantes: "+(this.numeroIntentos-this.numeroErrores));
    }
    
}
