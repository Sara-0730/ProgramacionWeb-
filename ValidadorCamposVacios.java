public class ValidadorCamposVacios extends Validador {
    @Override
    public boolean validar(Formulario formulario) {
        if (formulario.nombre.isEmpty() || formulario.correo.isEmpty() || formulario.usuario.isEmpty()) {
            System.out.println("Error: Hay campos vacíos.");
            return false;
        }
        if (siguiente != null) return siguiente.validar(formulario);
        return true;
    }
}