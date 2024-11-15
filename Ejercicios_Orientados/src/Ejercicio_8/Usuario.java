/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author Alumnos
 */
public class Usuario {
    private String idUsuario;
    private String nombre;
    private double saldo;

    public Usuario(String nombre,String id) {
        this.nombre = nombre;
        this.saldo = 0;
        this.idUsuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
