import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener { // Implementando ActionListener

    private JPanel MenuPane;
    private JLabel Menu;
    private JButton newButton = new JButton("New");
    private JButton openButton = new JButton("Open");
    private JButton saveButton = new JButton("Save");
    private JButton exitButton = new JButton("Exit");

    public Menu() {
        setContentPane(MenuPane);
        setTitle("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));

        buttonPanel.add(newButton);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);

        newButton.addActionListener(this);
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        exitButton.addActionListener(this);

        add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        } else {
            // Implemente a lógica para os outros botões aqui
            JOptionPane.showMessageDialog(this, "Botão pressionado: " + ((JButton)e.getSource()).getText());
        }
    }
}