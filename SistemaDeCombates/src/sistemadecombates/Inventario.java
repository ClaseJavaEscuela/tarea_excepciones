package sistemadecombates;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alumnos
 */
public class Inventario <TipoInventario> {
    private List<TipoInventario> inventario;

    public Inventario() {
        this.inventario = new LinkedList<>();
    }
    
    public void agregarItem(TipoInventario Item){
        inventario.add(Item);
        System.out.println("! se ha agregado con exito !");
    }
    
}
