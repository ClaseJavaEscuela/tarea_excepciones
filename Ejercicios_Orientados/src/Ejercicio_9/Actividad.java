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
public class Actividad {
    private Date fecha;
    private String actividad;

    public Actividad(Date fecha, String actividad) {
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }   
    
}
