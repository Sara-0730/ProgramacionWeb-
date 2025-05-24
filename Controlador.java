import java.util.Stack;

public class Controlador {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void ejecutarComando(Command cmd) {
        cmd.ejecutar();
        undoStack.push(cmd);
        redoStack.clear();
    }

    public void deshacer() {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            cmd.deshacer();
            redoStack.push(cmd);
        } else {
            System.out.println("Nada que deshacer");
        }
    }

    public void rehacer() {
        if (!redoStack.isEmpty()) {
            Command cmd = redoStack.pop();
            cmd.ejecutar();
            undoStack.push(cmd);
        } else {
            System.out.println("Nada que rehacer");
        }
    }
}