public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new Alimento(100),
            new Tecnologia(200),
            new Servicio(150)
        };

        Visitor visitorImpuesto = new ImpuestoVisitor();

        for (Producto producto : productos) {
            producto.aceptar(visitorImpuesto);
        }
    }
}