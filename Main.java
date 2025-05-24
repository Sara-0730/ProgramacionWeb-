public class Main {
    public static void main(String[] args) {
        Formulario form1 = new Formulario("Sara", "sara@example.com", "sara123");
        Formulario form2 = new Formulario("", "saraexample.com", "sara123");

        Validador validador = new ValidadorCamposVacios();
        validador.establecerSiguiente(new ValidadorFormatoCorreo())
                 .establecerSiguiente(new ValidadorUsuarioDuplicado());

        System.out.println("Validando formulario 1:");
        if (validador.validar(form1)) {
            System.out.println("Formulario 1 válido.");
        }

        System.out.println("\nValidando formulario 2:");
        if (validador.validar(form2)) {
            System.out.println("Formulario 2 válido.");
        }
    }
}