import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Café Premium", 10.5, 150, new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime()));
        productos.add(new Producto("Café Orgánico", 12.0, 100, new GregorianCalendar(2023, Calendar.MARCH, 20).getTime()));
        productos.add(new Producto("Café Descafeinado", 9.5, 200, new GregorianCalendar(2022, Calendar.DECEMBER, 5).getTime()));

        ContextoOrdenamiento contexto = new ContextoOrdenamiento(productos);

        System.out.println("Ordenar por precio:");
        contexto.setEstrategia(new OrdenarPorPrecio());
        contexto.ordenar();
        contexto.mostrarProductos();

        System.out.println("\nOrdenar por popularidad:");
        contexto.setEstrategia(new OrdenarPorPopularidad());
        contexto.ordenar();
        contexto.mostrarProductos();

        System.out.println("\nOrdenar por fecha:");
        contexto.setEstrategia(new OrdenarPorFecha());
        contexto.ordenar();
        contexto.mostrarProductos();
    }
}