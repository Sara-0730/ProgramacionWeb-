public class Alimento implements Producto {
    private double precio;

    public Alimento(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}