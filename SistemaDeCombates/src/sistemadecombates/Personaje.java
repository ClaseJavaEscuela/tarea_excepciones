/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecombates;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumnos
 */
public abstract class Personaje <TipoDePersonaje> {
    
    private String nombre;
    private int edad;
    private String habilidad;
    private String ataque;
    private int vida;
    private List<Habilidades> habilidades;

    public Personaje(String nombre, int edad, String habilidad, String ataque, List<Habilidades> habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.habilidades = new ArrayList<>();
    }
    
    public int usarHabilidad(int numeroHabilidad){
        if(numeroHabilidad < 0 || numeroHabilidad > habilidades.size()){
            System.out.println("Habilidad no existente\n!PIERDES TURNO POR MAMON!");
            return -1;
        }
        int danio = habilidades.get(numeroHabilidad).usar();
        return danio;
    }
    
    public abstract void defensa();
    public abstract void movimineto();

    public void setVida(int danio) {
        this.vida = vida - danio;
    }
    
    public void recibirDanio(int danio){
        setVida(danio);
    }
    
    public void agregarHabilidad(Habilidades nuevaHabilidad){
        habilidades.add(nuevaHabilidad);
        return ;
    }
    
    
}
