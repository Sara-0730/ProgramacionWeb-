public class Main {
    public static void main(String[] args) {
        OrdenCompra orden = new OrdenCompra.Builder("001", "Sara Pérez")
            .conDireccion("Calle 123, Bogotá")
            .agregarProducto("Café premium")
            .agregarProducto("Filtro de papel")
            .conDescuento(10)
            .conEnvioIncluido(true)
            .build();

        orden.mostrarResumen();
    }
}