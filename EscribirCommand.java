public class EscribirCommand implements Command {
    private Editor editor;
    private String textoEscrito;

    public EscribirCommand(Editor editor, String texto) {
        this.editor = editor;
        this.textoEscrito = texto;
    }

    @Override
    public void ejecutar() {
        editor.escribir(textoEscrito);
    }

    @Override
    public void deshacer() {
        editor.borrar(textoEscrito.length());
    }
}