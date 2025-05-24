public class Servicio implements Producto {
    private double precio;

    public Servicio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}