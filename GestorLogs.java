import java.util.HashMap;

public class GestorLogs {
    private HashMap<String, LogMensaje> plantillas = new HashMap<>();

    public GestorLogs() {
        plantillas.put("info", new LogInfo());
        plantillas.put("advertencia", new LogAdvertencia());
        plantillas.put("error", new LogError());
    }

    public LogMensaje obtenerLog(String tipo) {
        LogMensaje plantilla = plantillas.get(tipo.toLowerCase());
        return plantilla != null ? plantilla.clone() : null;
    }
}