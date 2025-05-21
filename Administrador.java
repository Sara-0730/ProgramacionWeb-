public class Administrador implements Usuario {
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Administrador. Puedo gestionar el sistema.");
    }

    public void gestionarSistema() {
        System.out.println("El administrador está gestionando el sistema...");
    }
}