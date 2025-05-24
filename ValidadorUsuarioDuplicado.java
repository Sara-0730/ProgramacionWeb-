import java.util.HashSet;
import java.util.Set;

public class ValidadorUsuarioDuplicado extends Validador {
    private static Set<String> usuariosRegistrados = new HashSet<>();

    @Override
    public boolean validar(Formulario formulario) {
        if (usuariosRegistrados.contains(formulario.usuario)) {
            System.out.println("Error: Usuario duplicado.");
            return false;
        }
        usuariosRegistrados.add(formulario.usuario);
        if (siguiente != null) return siguiente.validar(formulario);
        return true;
    }
}