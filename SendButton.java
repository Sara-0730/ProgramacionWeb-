import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendButton extends JButton implements ChatComponent {
    private ChatMediator mediator;
    private TextInput input;

    public SendButton(String label, TextInput input) {
        super(label);
        this.input = input;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.sendMessage(input.getText(), SendButton.this);
            }
        });
    }

    @Override
    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }
}