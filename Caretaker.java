import java.util.Stack;

public class Caretaker {
    private Stack<UserSettings.Memento> history = new Stack<>();

    public void save(UserSettings settings) {
        history.push(settings.saveToMemento());
    }

    public void undo(UserSettings settings) {
        if (!history.isEmpty()) {
            settings.restoreFromMemento(history.pop());
        } else {
            System.out.println("No hay configuraciones previas para restaurar.");
        }
    }
}