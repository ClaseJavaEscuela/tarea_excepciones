/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args) {
        CuentaBancaria banco =new CuentaBancaria();
        
        banco.agregarUsuario(new Usuario("Luis","001"));
        banco.agregarUsuario(new Usuario("Angel","002"));
        banco.agregarUsuario(new Usuario("Diaz","003"));
        banco.agregarUsuario(new Usuario("Diaz","004"));
        
        
        try {
            banco.deposito(600,"001");
            banco.retirar(500, "001");
            banco.consultarSaldo("001");
            
            banco.deposito(-600,"001");
            banco.retirar(500, "001");
            banco.consultarSaldo("001");
            
        } catch (UsuarioException e) {
            System.out.println("Error: "+e.getMessage());
        }catch (InsufficientFundsException e) {
            System.out.println("Error: "+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
    }
    
}
