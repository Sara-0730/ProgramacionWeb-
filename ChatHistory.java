import javax.swing.*;
import java.awt.*;

public class ChatHistory extends JTextArea implements ChatComponent {
    private ChatMediator mediator;

    public ChatHistory() {
        setEditable(false);
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    public void addMessage(String message) {
        append(message + "\n");
    }

    @Override
    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }
}