import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private JLabel SejaBemVindo;
    private JTextField digiteSeuNomeDeTextField;
    private JPanel CadastroPane;
    private JButton cadastroButton;
    private JLabel senhaLabel;
    private JLabel usuárioLabel;
    private JLabel confirmarSenhaLabel;
    private JTextField digiteSuaSenhaTextField;
    private JTextField confirmeSuaSenhaTextField;
    private JButton loginButton;

    public Cadastro () {
        setContentPane(CadastroPane);
        setTitle("Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setVisible(true);

        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = digiteSeuNomeDeTextField.getText();
                JOptionPane.showConfirmDialog(Cadastro.this, "Olá" + firstName);
                new Menu();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
            }
        });
    }
}
