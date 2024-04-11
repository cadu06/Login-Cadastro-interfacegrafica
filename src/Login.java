import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel BemVindoDeVoltaLabel;
    private JButton loginButton;
    private JPanel LoginPane;
    private JLabel usuárioLabel;
    private JLabel senhaLabel;
    private JTextField DIgiteSuaSenhaTextField;
    private JCheckBox lembrarMeCheckBox;
    private JButton cadastrarSeButton;
    private JTextField nomeDeUsuárioTextField;

    public Login() {
        setContentPane(LoginPane);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
            }
        });
        cadastrarSeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cadastro();
            }
        });
    }
}
