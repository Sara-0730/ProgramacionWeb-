public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Controlador controlador = new Controlador();

        controlador.ejecutarComando(new EscribirCommand(editor, "Hola "));
        controlador.ejecutarComando(new EscribirCommand(editor, "Mundo"));
        System.out.println("Texto actual: " + editor.getTexto());

        controlador.deshacer();
        System.out.println("Después de deshacer: " + editor.getTexto());

        controlador.rehacer();
        System.out.println("Después de rehacer: " + editor.getTexto());

        controlador.ejecutarComando(new BorrarCommand(editor, 6));
        System.out.println("Después de borrar: " + editor.getTexto());

        controlador.deshacer();
        System.out.println("Después de deshacer borrar: " + editor.getTexto());
    }
}