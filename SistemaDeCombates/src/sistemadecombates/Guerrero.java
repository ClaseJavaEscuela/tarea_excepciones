package sistemadecombates;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alumnos
 */
public class Guerrero extends Personaje<Guerrero>{
    
    private String historia;
    private int asesinatos;
    private List<String> frases;

    public Guerrero(String historia,List<String> frases, int asesinatos, String nombre, int edad, String habilidad, String ataque, List<Habilidades> habilidades) {
        super(nombre, edad, habilidad, ataque, habilidades);
        this.historia = historia;
        this.asesinatos = asesinatos;
        this.frases =   frases;
    }
    public void fraseNueva(String nuevaFrase){
        frases.add(nuevaFrase);
    }
    @Override
    public void defensa() {
        System.out.println("No te quiere !!!");
    }

    @Override
    public void movimineto(){
        System.out.println("se sube en la bici");
    }
    
  
}
