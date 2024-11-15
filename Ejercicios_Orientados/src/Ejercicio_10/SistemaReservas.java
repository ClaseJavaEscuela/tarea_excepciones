/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */

class SeatAlreadyReservedException extends Exception{
    public SeatAlreadyReservedException(String mensaje){
        super(mensaje);
    }
}

public class SistemaReservas {
    private List<Asiento> salaCine;
    private int numeroSala;
    int filas = 5;
    int columnas = 3;
    
    
    public void iniciarSala(){
        
        for(int i = 0; i<filas;i++){
            for(int j = 0; j < columnas ;j++){
                Asiento nuevoAsiento = new Asiento(i+1, j+1, false);
                salaCine.add(nuevoAsiento);
            }
        }
        
    }
    
    public SistemaReservas(int numeroSala) {
        this.numeroSala = numeroSala;
        this.salaCine = new ArrayList<>();
        iniciarSala();
    }
    
    private boolean asientoOcupado(int fila,int columna){
        for(Asiento asiento:salaCine){
            if(asiento.getFila() == fila && asiento.getColumna() == columna && asiento.isOcupado() == false){
                asiento.setOcupado(true);
                return false;
            }
        }
        return true;
    }
    
    public boolean reservarAsiento(int fila, int columna) throws SeatAlreadyReservedException{
        if (fila < 0 || columna <0) {
            throw new IllegalArgumentException("El valor de la fila y de la columna no deben der ser negativos");
        }
        
        if(asientoOcupado(fila, columna)){
            throw new SeatAlreadyReservedException("El asiento ya esta ocupado");
        }
        System.out.println("\nASIENTO RESERVADO CON EXITO\n");
        return true;
    }
    
    public void mostrarSala(){
        for(Asiento asiento:salaCine){
            System.out.print("\nF: "+asiento.getFila()+"C: "+asiento.getColumna()+"\n Ocupado: "+asiento.isOcupado());
            if(asiento.getColumna() == columnas){
                System.out.println("\n");
            }
        }
    }
    
}
