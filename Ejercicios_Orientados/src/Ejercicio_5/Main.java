/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        JuegoDelAhorcado juego = new JuegoDelAhorcado();
        boolean juegoTerminado = false;
        int opcion = 0;
        char letra;
       
       
        do {            
            if(juego.isJuegoTerminado()){
                System.out.println("----- MENU -----");
                System.out.println("1 ----- iniciar juego");
                System.out.println("2 ----- salir");
                System.out.print("Opcion: ");
                try {
                    opcion = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("\nopcion no valida\n");
                    input.nextLine();
                    continue;
                }
            }
            if(opcion == 1){
                juego.inicarJuego();
                opcion = 0;
            }
            if(opcion == 2){
                System.out.println("\nFin del juego...\n");
                break;
            }
            juego.mostrarInfo();
            try {
                System.out.print("\nPosicion: ");
                int posicion = input.nextInt();
                System.out.print("Letra: ");
                letra = input.next().charAt(0);
                juego.validarCaracter(letra);
                juego.verificarLetra(posicion, letra);
                juego.finalizarJuego();
                
            } catch(InputMismatchException e){
                System.out.println("Error: La posicion debe de ser un numero");
                input.nextLine();
            }catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: "+e.getMessage());
            }

        } while (opcion != 2);
       

    }
}
