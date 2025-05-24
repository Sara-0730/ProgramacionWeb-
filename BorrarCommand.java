public class BorrarCommand implements Command {
    private Editor editor;
    private String textoBorrado;

    public BorrarCommand(Editor editor, int numCaracteres) {
        this.editor = editor;
        int start = editor.getTexto().length() - numCaracteres;
        if (start < 0) start = 0;
        textoBorrado = editor.getTexto().substring(start);
    }

    @Override
    public void ejecutar() {
        editor.borrar(textoBorrado.length());
    }

    @Override
    public void deshacer() {
        editor.escribir(textoBorrado);
    }
}