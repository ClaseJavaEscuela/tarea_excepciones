/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author luisd
 */
public class Main {
    public static void main(String[] args) {
         RegistroEstudiantil registro = new RegistroEstudiantil();
        
        try {
            Estudiante primerEstudiante = new Estudiante("Luis", "0001");
            registro.registrarAlumno(primerEstudiante);
            
            Estudiante segundoEstudiante = new Estudiante("", "0002");
            registro.registrarAlumno(segundoEstudiante);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear estudiante: " + e.getMessage());
        } catch (DuplicateStudentException e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
        }

        try {
            Estudiante tercerEstudiante = new Estudiante("Angel", "0003");
            registro.registrarAlumno(tercerEstudiante);
            
            Estudiante cuartoEstudiante = new Estudiante("Yael", "0003");
            registro.registrarAlumno(cuartoEstudiante);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear estudiante: " + e.getMessage());
        } catch (DuplicateStudentException e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
        }
        
    }
}
