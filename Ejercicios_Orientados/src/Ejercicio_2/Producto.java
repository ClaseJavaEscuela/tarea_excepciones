/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author luisd
 */
public class Producto {
    private double precio;
    private String nombreProducto;
    private String codigo;

    public Producto(double precio, String nombreProducto, String codigo) {
        this.precio = precio;
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public void info(){
        System.out.println("codigo: "+this.codigo+"\nNombre: "+this.nombreProducto+"\nPrecio: "+this.precio);
    }
    
}
