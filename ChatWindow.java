import javax.swing.*;
import java.awt.*;

public class ChatWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chat Mediator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            ChatMediatorImpl mediator = new ChatMediatorImpl();

            ChatHistory history = new ChatHistory();
            TextInput input = new TextInput(20);
            SendButton sendButton = new SendButton("Enviar", input);

            mediator.setComponents(history, input, sendButton);
            history.setMediator(mediator);
            input.setMediator(mediator);
            sendButton.setMediator(mediator);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(new JScrollPane(history), BorderLayout.CENTER);

            JPanel inputPanel = new JPanel();
            inputPanel.add(input);
            inputPanel.add(sendButton);

            panel.add(inputPanel, BorderLayout.SOUTH);
            frame.setContentPane(panel);
            frame.setVisible(true);
        });
    }
}