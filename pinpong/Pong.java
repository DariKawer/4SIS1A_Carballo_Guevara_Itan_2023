import java.awt.*;
import javax.swing.*;

public class Pong extends JFrame {
    private PongPanel panel;

    public Pong() {
        setSize(700, 450);
        setTitle("Ping Pong");
        setBackground(new Color(250, 165, 82));
        setResizable(false);

        setBounds(0, 50, 700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new PongPanel(this);
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public PongPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new Pong();
    }
}