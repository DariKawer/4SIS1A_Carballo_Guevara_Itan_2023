import javax.swing.*;

public class Pong extends JFrame {
    private PongPanel panel;
    private ImageIcon imagen = new ImageIcon("pipong.png");

    public Pong() {
        inicializar();
        initPanel();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void inicializar() {
        setSize(700, 450);
        setTitle("Ping Pong - Esc para más");
        setIconImage(imagen.getImage());
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void initPanel() {
        panel = new PongPanel(this);
        add(panel);

        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }

    public PongPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pong());
    }
}
