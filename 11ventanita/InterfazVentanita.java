import javax.swing.*;
import java.awt.event.*;

public class InterfazVentanita extends JFrame {
    
    public InterfazVentanita() {
        setTitle("Inicio de Sesion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(290, 190);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel usuariolab = new JLabel("Usuario:");
        usuariolab.setBounds(10, 10, 120, 50);

        JTextField usuariofield = new JTextField(20);
        usuariofield.setBounds(100, 20, 160, 25);

        JLabel contralab = new JLabel("Contraseña:");
        contralab.setBounds(10, 50, 80, 50);

        JPasswordField contrafield = new JPasswordField(20);
        contrafield.setBounds(100, 60, 160, 25);

        JButton boton = new JButton("Iniciar Sesion");
        boton.setBounds(100, 100, 120, 30);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuariofield.getText();
                String contra = new String(contrafield.getPassword());

                if (usuario.equals("usuario") && contra.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña inválido");
                }
            }
        });

        panel.add(usuariolab);
        panel.add(usuariofield);
        panel.add(contralab);
        panel.add(contrafield);
        panel.add(boton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> 
        new InterfazVentanita()
        );
    }
}
