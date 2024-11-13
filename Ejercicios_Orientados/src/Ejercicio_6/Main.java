/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        SistemaControlAcceso sistema = new SistemaControlAcceso();
        
        try {
            sistema.validarCrendenciales("Luis","123456");
            sistema.validarCrendenciales("Luis2","123456");
            sistema.validarCrendenciales("Luis3","123456");
            
            
            if(sistema.validarAcceso(new Usuario("Luis", "123456"))){
                System.out.println("Usuario Luis");
                System.out.println("Acceso concendido\n");
            }
            if(sistema.validarAcceso(new Usuario("Luis2", "1236"))){
                System.out.println("Acceso concendido");
            }
            
        } catch (InvalidCredencialException e) {
            System.out.println("Error: "+e.getMessage());
        }catch (NullPointerException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
