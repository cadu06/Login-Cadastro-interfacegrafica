import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private JLabel SejaBemVindo;
    private JTextField textField1;
    private JPanel CadastroPane;
    private JButton cadastroButton;
    private JPasswordField senhaPasswordField;
    private JLabel Senha;
    private JPasswordField passwordField1;

    public Cadastro () {
        setContentPane(CadastroPane);
        setTitle("Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showConfirmDialog(Cadastro.this, "Olá" + firstName);
                new Menu();
            }
        });
    }
}
