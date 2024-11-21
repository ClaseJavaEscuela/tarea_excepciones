/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodeventas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class RegistroDeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] informacion;
        try {
            
            File archivo = new File("ventas.txt");
            Scanner lector = new Scanner(archivo);
            
            String linea = lector.nextLine();
            informacion = linea.split(",");
            
            for(int i=0;i<3;i++){
                System.out.println(informacion[i]);
            }
            lector.close();
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Erro al escribir");
            e.printStackTrace();
        }
    }
    
}
