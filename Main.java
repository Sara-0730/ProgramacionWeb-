public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String windows = "windows"; // Cambia a "windows" o "mac" para probar

        switch (windows.toLowerCase()) {
            case "windows" -> factory = new WindowsFactory();
            case "linux" -> factory = new LinuxFactory();
            case "mac" -> factory = new MacFactory();
            default -> throw new IllegalArgumentException("Sistema operativo no soportado");
        }

        Aplicacion app = new Aplicacion(factory);
        app.pintar();
    }
}