/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUES: SAN JACINTO
 */
public class Main {

    public static void main(String[] args) {
        CuentaBancariaSegura miCuenta = new CuentaBancariaSegura("Luis");
        int opcion = 0;
        double monto = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.________DEPOSITAR");
            System.out.println("2.________RETIRAR");
            System.out.println("3.________SALIR");
            try {
                System.out.print("opcion: ");
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nSolo se aceptan numeros\n");
                input.nextLine();
            }

            if (opcion == 1) {
                try {
                    System.out.print("Ingrese el monto: ");
                    monto = input.nextDouble();
                    miCuenta.depositar(monto);
                } catch (ExceptionErrorBancario e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("\nSolo se aceptan numeros\n");
                    input.nextLine();
                }
            }

            if (opcion == 2) {
                try {
                    System.out.print("Ingrese el monto: ");
                    monto = input.nextDouble();
                    miCuenta.retirar(monto);
                } catch (ExceptionErrorBancario e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("\nSolo se aceptan numeros\n");
                    input.nextLine();
                }
            }

            if (opcion == 3) {
                System.out.println("Fin del programa");
            }

        } while (opcion != 3);

    }
}
