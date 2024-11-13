package Ejercicio_2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        LectorInteligente lector = new LectorInteligente();
        String ruta = "";
        try {
            System.out.println("Ingrese la ruta del archivo");
            ruta =  input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("La ruta no es esta bien escrita");
            
        }
        
        lector.leerArchivo(ruta);
    }
}
