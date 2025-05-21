public class UsuarioFactory {
    public static Usuario crearUsuario(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cliente":
                return new Cliente();
            case "administrador":
                return new Administrador();
            case "operador":
                return new Operador();
            default:
                throw new IllegalArgumentException("Tipo de usuario desconocido: " + tipo);
        }
    }
}