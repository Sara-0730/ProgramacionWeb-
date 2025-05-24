import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private ChatHistory history;
    private TextInput input;
    private SendButton sendButton;

    public void setComponents(ChatHistory history, TextInput input, SendButton sendButton) {
        this.history = history;
        this.input = input;
        this.sendButton = sendButton;
    }

    @Override
    public void sendMessage(String message, ChatComponent sender) {
        if (sender instanceof SendButton) {
            history.addMessage("Usuario: " + message);
            input.clear();
        }
    }
}