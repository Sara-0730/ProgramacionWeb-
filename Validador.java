public abstract class Validador {
    protected Validador siguiente;

    public Validador establecerSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public abstract boolean validar(Formulario formulario);
}