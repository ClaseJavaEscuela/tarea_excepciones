package Ejercicio_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
public class LectorInteligente {
    
    BufferedReader reader;
    private String ruta;

    public LectorInteligente() {
        this.ruta = "";
        this.reader = null;
    }
    public LectorInteligente(String ruta) {
        this.ruta = "";
    }
    
    public void leerArchivo(String ruta){
        try {
            this.reader = new BufferedReader(new FileReader(ruta));
            String linea = reader.readLine();
            System.out.println("Contenido: "+linea);
        } catch (IOException e) {
            System.out.println("El archivo no se encontro");
        }
        
    }

}
