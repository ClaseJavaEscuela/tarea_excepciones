/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

/**
 *
 * @author LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SAN JACINTO
 */

class ExceptionErrorBancario extends Exception{
    public ExceptionErrorBancario(String message){
        super(message);
    }
}

public class CuentaBancariaSegura {
    private double saldo;
    private String nombre;
    
    
    public CuentaBancariaSegura(String nombre){
        this.saldo = 0;
        this.nombre = nombre;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double monto){
        this.saldo = monto;
    }
    
    public void depositar(double monto) throws ExceptionErrorBancario{
        if(monto < 0){
            throw new ExceptionErrorBancario("El monto no es valido");
        }
        double nuevoSaldo = monto + getSaldo();
        setSaldo(nuevoSaldo);
        System.out.println("DESPOSITO COMPLETADO ...");
    }
    
    public void retirar(double monto) throws ExceptionErrorBancario{
        if(monto > getSaldo()){
            throw new ExceptionErrorBancario("Saldo insuficiente");
        }
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
        System.out.println("RETIRO COMPLETADO ...");
    }
    
}
