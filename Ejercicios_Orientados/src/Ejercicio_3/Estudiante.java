/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author luisd
 */
public class Estudiante {
    private String nombre;
    private String ID;

    public Estudiante(String nombre, String ID) {
        setID(ID);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        if(this.nombre == null || this.nombre.trim().isEmpty()){
            throw new IllegalArgumentException("\nEl nombre no es valido\n");
        }
        this.nombre = nombre;
    }

    public void setID(String ID) {
        if(this.ID == null || this.ID.trim().isEmpty()){
            throw new IllegalArgumentException("\nEl id no es valido\n");
        }
        this.ID = ID;
    }
 
}
