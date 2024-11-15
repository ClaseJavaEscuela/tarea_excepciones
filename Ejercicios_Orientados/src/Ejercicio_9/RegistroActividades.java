/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumnos
 */

class DuplicateActivityException extends Exception{
    public DuplicateActivityException(String mensaje){
        super(mensaje);
    }
}

public class RegistroActividades {
    private List<Actividad> registroActividades;

    public RegistroActividades() {
        this.registroActividades = registroActividades;
    }
    
    private boolean fechaInvalida(Date fecha){
        Date fechaActual = new Date();
        
        
        if(fechaActual.after(fecha)){
            return true;
        }
        return false;
    }
    
    private boolean fechaDuplicada(Date fecha){
        
        for(Actividad actividad:registroActividades){
            if(actividad.getFecha().equals(fecha)){
                return true;
            }
        }

        return false;
    }
    
    
    public void agregarActivida(Actividad nuevaActividad) throws DuplicateActivityException{
        
        if(fechaDuplicada(nuevaActividad.getFecha())){
           throw new DuplicateActivityException("Error la fecha es duplicada");
        }
        
        if(fechaInvalida(nuevaActividad.getFecha())){
            throw new IllegalArgumentException("La fecha no es valida");
        }
        
        registroActividades.add(nuevaActividad);
        
        System.out.println("\nACTIVIDAD REGISTRADA CON EXITO...\n");
    }
    
    
    
}
