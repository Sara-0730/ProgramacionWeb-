import java.util.List;

public class OrdenarPorPopularidad implements Strategy {
    public void ordenar(List<Producto> productos) {
        productos.sort((p1, p2) -> Integer.compare(p2.popularidad, p1.popularidad));
    }
}