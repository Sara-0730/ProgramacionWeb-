public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Café Premium");

        Cliente cliente1 = new Cliente("Ana");
        Cliente cliente2 = new Cliente("Luis");

        producto.registerObserver(cliente1);
        producto.registerObserver(cliente2);

        producto.setDescuento(20);  // Notifica a Ana y Luis

        producto.removeObserver(cliente2);

        producto.setDescuento(30);  // Notifica solo a Ana
    }
}