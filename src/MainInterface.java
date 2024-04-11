import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {
    private JPanel MainPane;
    private JLabel BemVindoLabel;
    private JButton LoginButton;
    private JButton CasdastrarButton;

    public MainInterface () {
        setContentPane(MainPane);
        setTitle("Bem vindo!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        CasdastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cadastro();
            }
        });

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
            }
        });
    }

    public static void main(String[] args) {
        new MainInterface();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}