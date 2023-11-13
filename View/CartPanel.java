package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartPanel extends JPanel {
    private MainFrame mainFrame;
    private JPanel panel1;
    private JButton LEASEWORKDButton;

    public CartPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        JButton goBackButton = new JButton("Go Back");
        LEASEWORKDButton = new JButton("YO MF");
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new HomePanel(mainFrame));
            }
        });
        add(goBackButton);
        add(LEASEWORKDButton);
        add(panel1);
    }
}