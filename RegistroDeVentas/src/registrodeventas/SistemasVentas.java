
package registrodeventas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class SistemasVentas {
    private String ruta;
    private List<String[]> data;
    
    private boolean leerData(String ruta) throws FileNotFoundException{
        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);
            String[] lineaLeida;
            while(lector.hasNextLine()){
                lineaLeida = lector.nextLine().split(",");
                this.data.add(lineaLeida);
            }
            
        
        } catch (Exception e) {
            System.out.println("Erro al obtener la data");
        }
        return true;
    }
    
    
    public SistemasVentas(String ruta){
        this.ruta = ruta;
    }
}
