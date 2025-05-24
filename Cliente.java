public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String productName, double discount) {
        System.out.println("Hola " + nombre + ", el producto " + productName + " está con un descuento del " + discount + "%!");
    }
}