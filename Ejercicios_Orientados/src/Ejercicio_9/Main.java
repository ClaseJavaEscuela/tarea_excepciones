/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

import java.util.Date;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        RegistroActividades miRegistro = new RegistroActividades();
        
        try {
            miRegistro.agregarActivida(new Actividad(new Date(),"esta tarea es nuea"));
        } catch (DuplicateActivityException e) {
            System.out.println("Erro: "+e.getMessage());
        }catch(IllegalArgumentException e ){
            System.out.println("Erro: "+e.getMessage());
        }
    }
   
}
