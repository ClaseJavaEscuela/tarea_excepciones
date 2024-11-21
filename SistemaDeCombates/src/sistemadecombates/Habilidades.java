package sistemadecombates;

/**
 *
 * @author Alumnos
 */
public class Habilidades <tipoHabilidad> {
    private String nombreHabilidad;
    private int poder;
    private String tipo;

    public Habilidades(String nombreHabilidad, int poder, String tipo) {
        this.nombreHabilidad = nombreHabilidad;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public int getPoder() {
        return poder;
    }
    
    public int usar(){
        int danio = getPoder();
        System.out.println("dañio infligido: "+danio);
        return danio;
    }
    
    public String getTipo() {
        return tipo;
    }
   
    
}
