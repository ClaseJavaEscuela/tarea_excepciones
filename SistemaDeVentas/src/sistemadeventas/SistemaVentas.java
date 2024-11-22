
package sistemadeventas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

/**
 *
 * @author 
 * LUIS ANGEL DIAZ DIAZ
 * CAMPUS: SJ
 */
public class SistemaVentas {
    private String ruta;
    
    public SistemaVentas(String ruta){
        verificarYCrearArchivo(ruta);
        
    }
    private void verificarYCrearArchivo(String ruta) {
        File archivo = new File(ruta);
        
        if (archivo.exists()) {
            System.out.println("El archivo ya existe: " + ruta);
        } else {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado exitosamente: " + ruta);
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
        setRuta(ruta);
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    private List<String[]> leerArchivo(){
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                data.add(linea.split(","));
            }
            return data;
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return null;
    }
    
    private List<double[]> tratarData(List<String[]> data){
        List<double[]> dataPaseada = new ArrayList<>();
        double[] valores = null;
        for(String[] renglon:data){
             valores = new double[2];
            for(int i=0; i<renglon.length;i++){
                if(i>0){
                    valores[i-1] = Double.parseDouble(renglon[i]);
                }
            }
            dataPaseada.add(valores);
        }
        
        return dataPaseada;
    }
    
    public double calcularIngresosTotales(){
        List<String[]> data = leerArchivo();
        List<double[]> dataParseada = tratarData(data);
        double total = 0;
        
        for(double[] valores: dataParseada){
            total += valores[0]*valores[1];
        }
        
        return total;
    }
    private void mostrarValor(String valor,int indice){
        int[] dimensiones = {12,10,17};
        String mensaje = "";
        int numeroEspacios = dimensiones[indice] - (valor.length()+1);
        for(int i=0;i<numeroEspacios;i++){
           mensaje += " ";
        }
        mensaje += valor+" |";
        System.out.print(mensaje);
        
    }
    
    public void listarVentas(){
        List<String[]> ventas = leerArchivo();
        
        System.out.println("\n=== Sistema de Gestion de Ventas ==");
        System.out.println("Listado de Ventas");
        System.out.println("ID Producto | Cantidad | Precio Unitario |");
        
        int longitud = ventas.size();
        if(longitud == 0){
            System.out.println("\nNo hay ventas registradas");
            return ;
        }
        for(String[] datos: ventas){
            for(int i=0; i<datos.length;i++){
                mostrarValor(datos[i], i);
            }
            System.out.print("\n");
        }
    }
    
    public void agregarValor(String valores){
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter(this.ruta, true))) {
            archivo.write(valores);
            archivo.newLine();
        
        } catch (IOException e) {
            System.out.println("Error al agregar texto al archivo: " + e.getMessage());
        }
    }
    
    private String buscarVenta(int id){
        List<String[]> data = leerArchivo();
        String venta ="";
        
        for(String[] renglon:data){
            if(Integer.parseInt(renglon[0]) == id){
                return renglon[0]+","+renglon[1]+","+renglon[2];
            }
        }
        
        return "";
    }
    
    public void eliminarRenglon(int id) {
        List<String> lineas = new ArrayList<>();
        String renglonAEliminar = buscarVenta(id);
        
        if(renglonAEliminar.isEmpty()){
            System.out.println("\nVenta no encontrada");
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.equals(renglonAEliminar)) {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.ruta))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("\nventa eliminada exitosamente\n");
        } catch (IOException e) {
            System.out.println("\nError al escribir en el archivo: " + e.getMessage());
        }
    }
    
}
