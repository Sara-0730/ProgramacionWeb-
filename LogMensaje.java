public abstract class LogMensaje implements Cloneable {
    protected String tipo;
    protected String contenido;

    public void mostrar() {
        System.out.println("[" + tipo + "] " + contenido);
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public LogMensaje clone() {
        try {
            return (LogMensaje) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}