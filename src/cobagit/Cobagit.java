package cobagit;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cobagit extends JFrame {

    private static final long serialVersionUID = 1L;

    public Cobagit() {
        initUI();
    }

    private void initUI() {
        setTitle("Simple example");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        JLabel lbl = new JLabel("Name :");
        JTextField tf = new JTextField(15);
        JLabel lbl2 = new JLabel("Password :");
        JTextField tf2 = new JTextField(15);
        JButton button = new JButton("Login");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5,5,5,5);
        gbc.anchor = GridBagConstraints.LINE_START;
        add(lbl, gbc);
        gbc.gridx++;
        add(tf, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lbl2, gbc);
        gbc.gridx++;
        add(tf2, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(button, gbc);
        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Cobagit ex = new Cobagit();
                ex.setVisible(true);
            }
        });
    }
}
