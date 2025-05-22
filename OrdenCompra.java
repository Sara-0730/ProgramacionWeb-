import java.util.ArrayList;
import java.util.List;

class OrdenCompra {
    private final String id;
    private final String cliente;
    private final String direccion;
    private final List<String> productos;
    private final double descuento;
    private final boolean envioIncluido;

    private OrdenCompra(Builder builder) {
        this.id = builder.id;
        this.cliente = builder.cliente;
        this.direccion = builder.direccion;
        this.productos = builder.productos;
        this.descuento = builder.descuento;
        this.envioIncluido = builder.envioIncluido;
    }

    public void mostrarResumen() {
        System.out.println("Orden ID: " + id);
        System.out.println("Cliente: " + cliente);
        if (direccion != null) System.out.println("Dirección: " + direccion);
        if (!productos.isEmpty()) System.out.println("Productos: " + productos);
        if (descuento > 0) System.out.println("Descuento: " + descuento + "%");
        System.out.println("Envío incluido: " + (envioIncluido ? "Sí" : "No"));
    }

    public static class Builder {
        private final String id;
        private final String cliente;
        private String direccion;
        private List<String> productos = new ArrayList<>();
        private double descuento;
        private boolean envioIncluido;

        public Builder(String id, String cliente) {
            this.id = id;
            this.cliente = cliente;
        }

        public Builder conDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder agregarProducto(String producto) {
            this.productos.add(producto);
            return this;
        }

        public Builder conDescuento(double descuento) {
            this.descuento = descuento;
            return this;
        }

        public Builder conEnvioIncluido(boolean envio) {
            this.envioIncluido = envio;
            return this;
        }

        public OrdenCompra build() {
            return new OrdenCompra(this);
        }
    }
}