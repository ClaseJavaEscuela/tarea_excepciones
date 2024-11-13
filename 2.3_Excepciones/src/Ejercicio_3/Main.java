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
public class Main {
    public static void main(String[] args){
        try {
            VerificarEdad.validarEdad(25);
        } catch (DatosNoValidosException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
}
