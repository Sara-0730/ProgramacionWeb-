public abstract class TareaAutomatizada {
    public final void ejecutarTarea() {
        iniciar();
        ejecutarPrincipal();
        finalizar();
    }

    protected void iniciar() {
        System.out.println("Iniciando la tarea...");
    }

    protected abstract void ejecutarPrincipal();

    protected void finalizar() {
        System.out.println("Tarea finalizada.");
    }
}