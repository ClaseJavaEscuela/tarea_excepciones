package sistemadecombates;

import java.util.List;

/**
 *
 * @author Alumnos
 */
public class Arquero extends Personaje<Arquero>{
    private String historia;
    private int asesinatos;
    private List<String> frases;
    private int nivelPunteria;

    public Arquero(String historia, int asesinatos, List<String> frases, int nivelPunteria, String nombre, int edad, String habilidad, String ataque, List<Habilidades> habilidades) {
        super(nombre, edad, habilidad, ataque, habilidades);
        this.historia = historia;
        this.asesinatos = asesinatos;
        this.frases = frases;
        this.nivelPunteria = nivelPunteria;
    }

    @Override
    public void defensa() {
        System.out.println("Se cubre");
    }

    @Override
    public void movimineto() {
        System.out.println("se sube a su bici");
    }
    
    
    
}
