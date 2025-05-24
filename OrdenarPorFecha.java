import java.util.List;

public class OrdenarPorFecha implements Strategy {
    public void ordenar(List<Producto> productos) {
        productos.sort((p1, p2) -> p2.fecha.compareTo(p1.fecha));
    }
}