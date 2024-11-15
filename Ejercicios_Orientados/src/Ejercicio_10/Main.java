/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author luisd
 */
public class Main {
    public static void main(String[] args) {
        SistemaReservas salaCine = new SistemaReservas(10);
        
        salaCine.mostrarSala();
        
        try {
            salaCine.reservarAsiento(1, 3);
            salaCine.mostrarSala();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }catch(SeatAlreadyReservedException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try {
            salaCine.reservarAsiento(1, 3);
            salaCine.mostrarSala();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }catch(SeatAlreadyReservedException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
