public class Main {
    public static void main(String[] args) {
        TareaAutomatizada backup = new BackupTarea();
        TareaAutomatizada limpieza = new LimpiezaTarea();

        System.out.println("Ejecutando tarea de Backup:");
        backup.ejecutarTarea();

        System.out.println("\nEjecutando tarea de Limpieza:");
        limpieza.ejecutarTarea();
    }
}