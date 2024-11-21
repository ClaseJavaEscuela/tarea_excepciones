package sistemadecombates;

import java.util.List;

/**
 *
 * @author Alumnos
 */
public class Mago extends Personaje<Mago>{
    private String historia;
    private int asesinatos;
    private List<String> frases;
    private String tipoDeMago;
    private String nivelMago;

    public Mago(String historia, int asesinatos, List<String> frases, String tipoDeMago, String nivelMago, String nombre, int edad, String habilidad, String ataque, List<Habilidades> habilidades) {
        super(nombre, edad, habilidad, ataque, habilidades);
        this.historia = historia;
        this.asesinatos = asesinatos;
        this.frases = frases;
        this.tipoDeMago = tipoDeMago;
        this.nivelMago = nivelMago;
    }
    
    
    
    
    @Override
    public void defensa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void movimineto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
