public class ValidadorFormatoCorreo extends Validador {
    @Override
    public boolean validar(Formulario formulario) {
        if (!formulario.correo.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            System.out.println("Error: Formato de correo no válido.");
            return false;
        }
        if (siguiente != null) return siguiente.validar(formulario);
        return true;
    }
}