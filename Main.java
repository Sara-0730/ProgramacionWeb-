public class Main {
    public static void main(String[] args) {
        GestorLogs gestor = new GestorLogs();

        LogMensaje log1 = gestor.obtenerLog("info");
        log1.setContenido("El sistema arrancó correctamente.");
        log1.mostrar();

        LogMensaje log2 = gestor.obtenerLog("advertencia");
        log2.setContenido("Uso de memoria alta detectado.");
        log2.mostrar();

        LogMensaje log3 = gestor.obtenerLog("error");
        log3.setContenido("No se pudo conectar a la base de datos.");
        log3.mostrar();
    }
}