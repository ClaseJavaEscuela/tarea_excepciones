/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumnos
 */
class InvalidCredencialException extends Exception{
    public InvalidCredencialException(String mensaje){
        super(mensaje);
    }
}

public class SistemaControlAcceso {
    private List<Usuario> usuarios;
    
    public SistemaControlAcceso(){
        this.usuarios = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario nuevoUsuario){
        this.usuarios.add(nuevoUsuario);
    }
    
    private boolean isNombreRepetido(String nombre){
        if(this.usuarios.isEmpty()){
            return false;
        }
        
        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
    public void validarCrendenciales(String nombre,String contrasena) throws InvalidCredencialException{
        
        if(nombre == null || contrasena == null){
            throw new NullPointerException("Todos los campos deben de ser rellenados");
        }
        if(isNombreRepetido(nombre)){
            throw new InvalidCredencialException("El nombre ya existe");
        }
        agregarUsuario(new Usuario(nombre,contrasena));
    }
    
    public boolean validarAcceso(Usuario usuarioAValidar) throws InvalidCredencialException{
        boolean acceso = false;
        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equalsIgnoreCase(usuarioAValidar.getNombre())){
                if(usuario.getContrasena().equals(usuarioAValidar.getContrasena())){
                    acceso = true;
                }else{
                    throw new InvalidCredencialException("La contrasena no es correcta");
                }
            }
        }
        
        if (!acceso) {
            throw new InvalidCredencialException("El nombre no es correcto");
        }
        
        return acceso;
    }
    
}
