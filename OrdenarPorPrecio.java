import java.util.List;
import java.util.Comparator;

public class OrdenarPorPrecio implements Strategy {
    public void ordenar(List<Producto> productos) {
        productos.sort(Comparator.comparingDouble(p -> p.precio));
    }
}