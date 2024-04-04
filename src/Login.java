import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel BemVindoDeVoltaLabel;
    private JTextField nomeDeUsuárioTextField;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel LoginPane;

    public Login() {
        setContentPane(LoginPane);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
            }
        });
    }
}
