package View;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel panel1;
    public MainFrame() {
        setTitle("GUI Navigation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create and set an initial panel
        setContentPane(new HomePanel(this));
        setVisible(true);
    }

    public void changePanel(JPanel newPanel) {
        setContentPane(newPanel);
        revalidate();
        repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
