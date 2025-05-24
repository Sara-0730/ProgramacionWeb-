import java.util.Date;

public class Producto {
    String nombre;
    double precio;
    int popularidad;
    Date fecha;

    public Producto(String nombre, double precio, int popularidad, Date fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.popularidad = popularidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre + " | Precio: $" + precio + " | Popularidad: " + popularidad + " | Fecha: " + fecha;
    }
}