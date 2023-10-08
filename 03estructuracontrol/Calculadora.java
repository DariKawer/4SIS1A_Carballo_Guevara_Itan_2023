/*
 * Efectivamente no voy a explicar como hice esto pq me tarde 3 dias en hacerlo
 * Recomiendo nomas leer la documentacion de swing y awt
 * y ver videos de la india ez
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora {

    private JFrame interfaz;

    public Calculadora() {
        base();
    }

    private void base() {
        interfaz = new JFrame();
        ImageIcon imagen = new ImageIcon("logo.png");

        interfaz.setTitle("Menú");
        interfaz.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        interfaz.setSize(400, 500);
        interfaz.setResizable(false);
        interfaz.setIconImage(imagen.getImage());
        interfaz.getContentPane().setBackground(new Color(255, 165, 82));

        JLabel label = new JLabel("Elige alguna de estas opciones: ");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setPreferredSize(new Dimension(400, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(new Color(255, 165, 82));

        JButton botonSumar = new JButton("Sumar");
        JButton botonRestar = new JButton("Restar");
        JButton botonMultiplicar = new JButton("Multiplicación");
        JButton botonDividir = new JButton("División");
        JButton botonSalir = new JButton("Salir");

        JButton[] botones = { botonSumar, botonRestar, botonMultiplicar, botonDividir, botonSalir };

        for (JButton boton : botones) {
            boton.setFocusable(false);
            boton.setBackground(new Color(213, 44, 6));
            boton.setForeground(Color.WHITE);
            boton.setFont(new Font("Comic Sans", Font.BOLD, 25));
            boton.setPreferredSize(new Dimension(400, 50));
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String comando = e.getActionCommand();
                    switch (comando) {
                        case "Sumar":
                            Sumar();
                            break;
                        case "Restar":
                            Restar();
                            break;
                        case "Multiplicación":
                            Multiplicar();
                            break;
                        case "División":
                            Dividir();
                            break;
                        case "Salir":
                            int respuesta = JOptionPane.showConfirmDialog(interfaz, "¿Estás seguro de querer salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (respuesta == JOptionPane.YES_OPTION) {
                                interfaz.dispose();
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(interfaz, "Por favor elige una opción correcta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                }
            });

            menu.add(Box.createRigidArea(new Dimension(0, 25)));
            menu.add(boton);
        }

        interfaz.setLocationRelativeTo(null);
        interfaz.add(label, BorderLayout.NORTH);
        interfaz.add(menu, BorderLayout.CENTER);
        interfaz.setVisible(true);
    }

    private void Sumar() {
        interfaz.setTitle("Sumar");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(800, 220);
        interfaz.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 50)); 
        panel.setBackground(new Color(255, 165, 82));

        JTextField primernum = new JTextField();
        primernum.setPreferredSize(new Dimension(250, 50));

        JTextField segundonum = new JTextField();
        segundonum.setPreferredSize(new Dimension(250, 50));

        JButton sumar = new JButton("+");
        sumar.setFocusable(false);
        sumar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sumar.setPreferredSize(new Dimension(50, 50));

        panel.add(primernum);
        panel.add(sumar);
        panel.add(segundonum);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primerNumero = primernum.getText();
                String segundoNumero = segundonum.getText();
                
                if (primerNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el primer número");
                } else if (segundoNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el segundo número");
                } else {
                    try {
                        double num1 = Double.parseDouble(primerNumero);
                        double num2 = Double.parseDouble(segundoNumero);
                        double resultado = num1 + num2;
                        JOptionPane.showMessageDialog(interfaz, "El resultado de la suma es: " + resultado);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(interfaz, "Ingrese números válidos");
                    }
                }
            }
        });
        
        JButton regresar = new JButton("Regresar");
        regresar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        regresar.setPreferredSize(new Dimension(400, 40));
        regresar.setFocusable(false);

        regresar.addActionListener(regresarbutton);
        interfaz.add(panel, BorderLayout.CENTER);
        interfaz.add(regresar, BorderLayout.SOUTH);
        interfaz.setVisible(true);
    }

    private void Restar() {
        interfaz.setTitle("Restar");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(800, 220);
        interfaz.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 50)); 
        panel.setBackground(new Color(255, 165, 82));

        JTextField primernum = new JTextField();
        primernum.setPreferredSize(new Dimension(250, 50));

        JTextField segundonum = new JTextField();
        segundonum.setPreferredSize(new Dimension(250, 50));

        JButton sumar = new JButton("-");
        sumar.setFocusable(false);
        sumar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sumar.setPreferredSize(new Dimension(50, 50));

        panel.add(primernum);
        panel.add(sumar);
        panel.add(segundonum);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primerNumero = primernum.getText();
                String segundoNumero = segundonum.getText();
                
                if (primerNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el primer número");
                } else if (segundoNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el segundo número");
                } else {
                    try {
                        double num1 = Double.parseDouble(primerNumero);
                        double num2 = Double.parseDouble(segundoNumero);
                        double resultado = num1 - num2;
                        JOptionPane.showMessageDialog(interfaz, "El resultado de la resta es: " + resultado);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(interfaz, "Ingrese números válidos");
                    }
                }
            }
        });
        
        JButton regresar = new JButton("Regresar");
        regresar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        regresar.setPreferredSize(new Dimension(400, 40));
        regresar.setFocusable(false);

        regresar.addActionListener(regresarbutton);
        interfaz.add(panel, BorderLayout.CENTER);
        interfaz.add(regresar, BorderLayout.SOUTH);
        interfaz.setVisible(true);
    }

    private void Multiplicar() {
        interfaz.setTitle("Multiplicar");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(800, 220);
        interfaz.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 50)); 
        panel.setBackground(new Color(255, 165, 82));

        JTextField primernum = new JTextField();
        primernum.setPreferredSize(new Dimension(250, 50));

        JTextField segundonum = new JTextField();
        segundonum.setPreferredSize(new Dimension(250, 50));

        JButton sumar = new JButton("x");
        sumar.setFocusable(false);
        sumar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sumar.setPreferredSize(new Dimension(50, 50));

        panel.add(primernum);
        panel.add(sumar);
        panel.add(segundonum);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primerNumero = primernum.getText();
                String segundoNumero = segundonum.getText();
                
                if (primerNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el primer número");
                } else if (segundoNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el segundo número");
                } else {
                    try {
                        double num1 = Double.parseDouble(primerNumero);
                        double num2 = Double.parseDouble(segundoNumero);
                        double resultado = num1 * num2;
                        JOptionPane.showMessageDialog(interfaz, "El resultado de la multiplicación es: " + resultado);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(interfaz, "Ingrese números válidos");
                    }
                }
            }
        });
        
        JButton regresar = new JButton("Regresar");
        regresar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        regresar.setPreferredSize(new Dimension(400, 40));
        regresar.setFocusable(false);

        regresar.addActionListener(regresarbutton);
        interfaz.add(panel, BorderLayout.CENTER);
        interfaz.add(regresar, BorderLayout.SOUTH);
        interfaz.setVisible(true);
    }
    
    private void Dividir() {
        interfaz.setTitle("Dividir");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(800, 220);
        interfaz.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 50)); 
        panel.setBackground(new Color(255, 165, 82));

        JTextField primernum = new JTextField();
        primernum.setPreferredSize(new Dimension(250, 50));

        JTextField segundonum = new JTextField();
        segundonum.setPreferredSize(new Dimension(250, 50));

        JButton sumar = new JButton("÷");
        sumar.setFocusable(false);
        sumar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sumar.setPreferredSize(new Dimension(50, 50));

        panel.add(primernum);
        panel.add(sumar);
        panel.add(segundonum);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primerNumero = primernum.getText();
                String segundoNumero = segundonum.getText();
                
                if (primerNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el primer número");
                } else if (segundoNumero.isEmpty()) {
                    JOptionPane.showMessageDialog(interfaz, "Ingrese el segundo número");
                } else {
                    try {
                        double num1 = Double.parseDouble(primerNumero);
                        double num2 = Double.parseDouble(segundoNumero);
                        double resultado = num1 / num2;
                        JOptionPane.showMessageDialog(interfaz, "El resultado de la división es: " + resultado);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(interfaz, "Ingrese números válidos");
                    }
                }
            }
        });
        
        JButton regresar = new JButton("Regresar");
        regresar.setFont(new Font("Comic Sans", Font.BOLD, 25));
        regresar.setPreferredSize(new Dimension(400, 40));
        regresar.setFocusable(false);

        regresar.addActionListener(regresarbutton);
        interfaz.add(panel, BorderLayout.CENTER);
        interfaz.add(regresar, BorderLayout.SOUTH);
        interfaz.setVisible(true);
    }

    private ActionListener regresarbutton = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            interfaz.dispose();
            base();
        }
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> 
        new Calculadora()
        );
    }
}