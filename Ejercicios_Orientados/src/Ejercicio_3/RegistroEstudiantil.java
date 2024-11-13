/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */

class DuplicateStudentException extends Exception{
    public DuplicateStudentException(String mensaje){
        super(mensaje);
    }
}

public class RegistroEstudiantil {
    
    private List<Estudiante> registro;

    public RegistroEstudiantil() {
        this.registro = new ArrayList<>();
    }
    
    public void registrarAlumno(Estudiante nuevoEstudiente) throws DuplicateStudentException{
        int indice = buscarAlumno(nuevoEstudiente.getID());
        if(indice == -1){
            throw new DuplicateStudentException("El id ya esta ocupado");
        }
        
        registro.add(nuevoEstudiente);
        System.out.println("\nAlumno registrado\n");
    }
    
    public int buscarAlumno(String id){
        for (int i = 0; i < registro.size(); i++) {
            if(registro.get(i).getID().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
}
