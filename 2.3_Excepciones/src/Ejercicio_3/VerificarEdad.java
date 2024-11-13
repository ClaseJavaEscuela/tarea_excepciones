/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
class DatosNoValidosException extends Exception{
    public DatosNoValidosException(String mensaje){
        super(mensaje);
    }
}


public class VerificarEdad {

    public static void validarEdad(int edad) throws DatosNoValidosException{
        if(edad < 0){
            throw new DatosNoValidosException("Tasn medio tontio verdad :)");
        }
        if(edad < 18 ){
            throw new DatosNoValidosException("Lo siento, necesitas tener al menos 18 para usar este servicio ");
        }
        if(edad > 65){
            throw new DatosNoValidosException("Lo siento, este servicio es para menores de 65 anios");
        }
        System.out.println("Tu entras sin problemas");
    }
    
    
}
