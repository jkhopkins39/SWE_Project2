package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountGUI extends JFrame {
    private JButton backButton;
    private JPanel accountPanel;
    private MainFrame mainFrame;

    public AccountGUI(MainFrame mainFrame) {

        setContentPane(accountPanel);
        this.mainFrame = mainFrame;
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new HomePanel(mainFrame));
            }
        });
    }
}
