package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel panel1;
    private JButton orderNowButton;
    private JButton accountButton;
    private JButton cartButton;
    private JButton signUpButton;
    private JButton loginButton;
    private JLabel HomePageWelcome;
    private JTextField textField1;
    private JButton clickMeButton;
    private MainFrame mainFrame;

    public Main() {
        setContentPane(panel1);
        setTitle("Home Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
        accountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(new AccountGUI(mainFrame));
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
