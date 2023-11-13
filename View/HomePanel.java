package View;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel {
    private MainFrame mainFrame;
    public HomePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        JButton goToCartButton = new JButton("Go to Cart");
        goToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new CartPanel(mainFrame));
            }
        });
        add(goToCartButton);
    }
}
