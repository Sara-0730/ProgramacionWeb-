import javax.swing.*;

public class TextInput extends JTextField implements ChatComponent {
    private ChatMediator mediator;

    public TextInput(int columns) {
        super(columns);
    }

    @Override
    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public void clear() {
        setText("");
    }
}