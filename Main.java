public class Main {
    public static void main(String[] args) {
        UserSettings settings = new UserSettings("Español", "Oscuro", 50);
        Caretaker caretaker = new Caretaker();

        System.out.println("Estado inicial:");
        settings.showSettings();
        caretaker.save(settings); // Guardar estado

        settings.setLanguage("Inglés");
        settings.setTheme("Claro");
        settings.setVolume(75);
        System.out.println("\nEstado modificado:");
        settings.showSettings();

        caretaker.undo(settings); // Restaurar estado previo
        System.out.println("\nEstado restaurado:");
        settings.showSettings();
    }
}