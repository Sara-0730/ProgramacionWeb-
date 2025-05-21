public class Cliente implements Usuario {
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Cliente. Puedo realizar compras.");
    }

    public void comprar() {
        System.out.println("El cliente está comprando...");
    }
}