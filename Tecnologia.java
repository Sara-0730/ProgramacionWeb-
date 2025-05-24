public class Tecnologia implements Producto {
    private double precio;

    public Tecnologia(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}