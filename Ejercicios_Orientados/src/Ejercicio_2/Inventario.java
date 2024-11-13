/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author luisd
 */
public class Inventario {
    private List<Producto> inventario;

    public Inventario() {
        this.inventario = new ArrayList<>();
    }
    
    public void eliminarProducto(String codigo){
        int indice = buscarProducto(codigo);
        if(indice == -1){
            throw new NoSuchElementException("El producto "+codigo+" no fue encontrado");
        }
        inventario.remove(indice);
        System.out.println("Producto eliminado");
        
    }
    
    public void ingresarProducto(Producto nuevoProducto){
        int indice = buscarProducto(nuevoProducto.getCodigo());
        
        if(indice != -1){
            throw new IllegalArgumentException("El producto"+nuevoProducto.getCodigo()+" ya existe");
        }
        
        inventario.add(nuevoProducto);
    }
    public void mostrarInventario(){
        for(Producto producto: inventario){
            producto.info();
        }
    }
    public int buscarProducto(String codigo){
        for(int i=0;i<inventario.size();i++){
            if(inventario.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
   
}
