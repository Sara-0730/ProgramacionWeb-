import java.util.List;

public class ContextoOrdenamiento {
    private Strategy estrategia;
    private List<Producto> productos;

    public ContextoOrdenamiento(List<Producto> productos) {
        this.productos = productos;
    }

    public void setEstrategia(Strategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenar() {
        if (estrategia == null) {
            System.out.println("No se ha seleccionado una estrategia de ordenamiento.");
            return;
        }
        estrategia.ordenar(productos);
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}