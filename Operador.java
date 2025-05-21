public class Operador implements Usuario {
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Operador. Puedo monitorear el sistema.");
    }

    public void monitorear() {
        System.out.println("El operador está monitoreando el sistema...");
    }
}