public class App {
    public static void main(String[] args) {
        Usuario usuario1 = UsuarioFactory.crearUsuario("cliente");
        usuario1.mostrarRol();
        if (usuario1 instanceof Cliente) {
            ((Cliente) usuario1).comprar();
        }

        Usuario usuario2 = UsuarioFactory.crearUsuario("administrador");
        usuario2.mostrarRol();
        if (usuario2 instanceof Administrador) {
            ((Administrador) usuario2).gestionarSistema();
        }

        Usuario usuario3 = UsuarioFactory.crearUsuario("operador");
        usuario3.mostrarRol();
        if (usuario3 instanceof Operador) {
            ((Operador) usuario3).monitorear();
        }
    }
}