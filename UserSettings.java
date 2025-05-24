public class UserSettings {
    private String language;
    private String theme;
    private int volume;

    public UserSettings(String language, String theme, int volume) {
        this.language = language;
        this.theme = theme;
        this.volume = volume;
    }

    public void setLanguage(String language) { this.language = language; }
    public void setTheme(String theme) { this.theme = theme; }
    public void setVolume(int volume) { this.volume = volume; }

    public void showSettings() {
        System.out.println("Idioma: " + language + ", Tema: " + theme + ", Volumen: " + volume);
    }

    public Memento saveToMemento() {
        return new Memento(language, theme, volume);
    }

    public void restoreFromMemento(Memento memento) {
        this.language = memento.getLanguage();
        this.theme = memento.getTheme();
        this.volume = memento.getVolume();
    }

    public static class Memento {
        private final String language;
        private final String theme;
        private final int volume;

        private Memento(String language, String theme, int volume) {
            this.language = language;
            this.theme = theme;
            this.volume = volume;
        }

        private String getLanguage() { return language; }
        private String getTheme() { return theme; }
        private int getVolume() { return volume; }
    }
}