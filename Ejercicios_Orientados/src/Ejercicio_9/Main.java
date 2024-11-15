/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

import java.util.Calendar;
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
            
            //miRegistro.agregarActivida(new Actividad(new Date(),"esta tarea es nuea"));
            //insertar una actividad con una fecha de mañana
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(new Date());
            calendario.add(Calendar.DAY_OF_MONTH,5);
            
            Date fechaFutura = calendario.getTime();
            miRegistro.agregarActivida(new Actividad(fechaFutura,"Actividad en el futuro"));
            
        } catch (DuplicateActivityException e) {
            System.out.println("Erro: "+e.getMessage());
        }catch(IllegalArgumentException e ){
            System.out.println("Erro: "+e.getMessage());
        }
    }
   
}
