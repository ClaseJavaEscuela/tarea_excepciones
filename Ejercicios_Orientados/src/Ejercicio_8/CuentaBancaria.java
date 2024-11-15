/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumnos
 */

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String mensaje){
        super(mensaje);
    }
}
class UsuarioException extends  Exception{
    public UsuarioException(String mensaje){
        super(mensaje);
    }
}

public class CuentaBancaria {
    
    private List<Usuario> usuarios;

    public CuentaBancaria() {
        this.usuarios = new ArrayList<>();
    }
    
    private Usuario getUsuario(String id){
        for(Usuario usuario:this.usuarios){
            if(usuario.getIdUsuario().equals(id)){
                return usuario;
            }
        }
        return null;
    }
    
    public void agregarUsuario(Usuario nuevoUsuario){
        this.usuarios.add(nuevoUsuario);
    }
    
    public void retirar(double monto,String id) throws UsuarioException, InsufficientFundsException{
        if(monto < 0){
            throw new IllegalArgumentException("el monto no puede ser un valor negativo");
        }
        
        Usuario usuario = this.getUsuario(id);
        
        if(usuario == null){
            throw new UsuarioException("El usuario no existe");
        }
        
        if(monto > usuario.getSaldo()){
            throw new InsufficientFundsException("No cuentas con ese dinero");
        }
        
        double nuevoSaldo = usuario.getSaldo() - monto;
        
        usuario.setSaldo(nuevoSaldo);
        System.out.println("RETIRO COMPLEATADO...");
    }
    public void consultarSaldo(String id){
        Usuario usuario = getUsuario(id);
        System.out.println("\nINFORMACION DE CUENTA\nUsuario: "+usuario.getNombre());
        System.out.println("Saldo: "+usuario.getSaldo());
    }
    public void deposito(double monto, String id) throws UsuarioException{
        if(monto < 0){
            throw new IllegalArgumentException("el monto no puede ser un valor negativo");
        }
        
        Usuario usuario = this.getUsuario(id);
        
        if(usuario == null){
            throw new UsuarioException("El usuario no existe");
        }
        
        double nuevoSaldo = usuario.getSaldo() + monto;
        
        usuario.setSaldo(nuevoSaldo);
        System.out.println("DEPOSITO COMPLEATADO...");
        
    }
    
    
}
