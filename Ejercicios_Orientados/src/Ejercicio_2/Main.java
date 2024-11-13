/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

import java.util.NoSuchElementException;

/**
 *
 * @author luisd
 */
public class Main {

    public static void main(String[] args) {
        Inventario miInventario = new Inventario();

        try {
            Producto primerProducto = new Producto(15, "producto1", "001");
            Producto segundoProducto = new Producto(20, "producto 2", "002");
            Producto tercerProducto = new Producto(30, "producto 3", "002");

            miInventario.ingresarProducto(primerProducto);
            miInventario.ingresarProducto(segundoProducto);
            miInventario.ingresarProducto(tercerProducto);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n");
        miInventario.mostrarInventario();
        System.out.println("\n");
        
        try {
            miInventario.eliminarProducto("001");
            miInventario.eliminarProducto("004");
        } catch (NoSuchElementException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println("\n");
        miInventario.mostrarInventario();
        System.out.println("\n");

    }
}
