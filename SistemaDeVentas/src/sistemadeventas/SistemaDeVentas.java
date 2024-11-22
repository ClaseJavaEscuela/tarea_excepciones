/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeventas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisd
 */

public class SistemaDeVentas {

    public static void main(String[] args){
        SistemaVentas sistema = new SistemaVentas("ventas.txt");
        Scanner input = new Scanner(System.in);
        int ID = 0,cantidad = 0,opcion = 0;
        double precio = 0;
        
        do {            
            
            System.out.println("\n=== Sistema de Gestión de Ventas ===");
            System.out.println("1. Registrar venta");
            System.out.println("2. Listar ventas");
            System.out.println("3. Calcular ingresos totales");
            System.out.println("4. Borrar una venta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n!!Solo numeros");
                input.nextLine();
                continue;
            }
            
            if(opcion<1 || opcion >4){
                System.out.println("\nOpcion no existente!!\n");
                continue;
            }
            if(opcion == 1){
                //pedimos el ID del producto
                System.out.println("\n== REGISTRO DE PRODUCTOS ==");
                while(true){
                    try {
                        System.out.print("Ingrese el id del producto: ");
                        ID = input.nextInt();
                        if(ID < 1){
                            System.out.println("El ID no puede ser negativo o igual a cero");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        input.next();
                        System.out.println("Lo siento pero el Id no es valido, debe de ser un numero entero");
                        
                    }
                }
                
                while(true){
                    try {
                        System.out.print("\nIngrese la cantidad del producto: ");
                        cantidad = input.nextInt();
                        if(cantidad < 1){
                            System.out.println("La cantidad no puede ser negativo o igual a cero");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        input.next();
                        System.out.println("Lo siento pero la cantidad no es valido, debe de ser un numero entero");
                    }
                }
                while(true){
                    try {
                        System.out.print("\nIngrese el precio del producto: ");
                        precio = (double) input.nextFloat();
                        if(ID < 1){
                            System.out.println("El precio no puede ser negativo o igual a cero");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("\nLo siento pero el Id no es valido, debe de ser un numero decimal");
                        input.next();
                        continue;
                    }
                }
                
                String datos = ""+ID+","+cantidad+","+precio;
                sistema.agregarValor(datos);
                
            }
            if(opcion == 2){
                sistema.listarVentas();
            }
            if(opcion == 3){
                double total = sistema.calcularIngresosTotales();
                System.out.println("Total del inventario: "+total);
            }
            if(opcion == 4){
                sistema.eliminarRenglon(15);
            }
            if(opcion == 6){
                System.out.println("Programa finalizado ...");
            }
        } while (opcion != 4);
    }

    
}
