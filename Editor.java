public class Editor {
    private StringBuilder texto = new StringBuilder();

    public void escribir(String textoNuevo) {
        texto.append(textoNuevo);
    }

    public void borrar(int numCaracteres) {
        int start = texto.length() - numCaracteres;
        if (start < 0) start = 0;
        texto.delete(start, texto.length());
    }

    public String getTexto() {
        return texto.toString();
    }
}