
/*
 * Construye un programa que permita jugar con tus amigos AHORCADO. 
 * Deberás ingresar una palabra al arreglo cada letra es una posición del arreglo, 
 * le darás 3 pistas al jugador, cuántas letras son, cual es la primera letra y 
 * cuál es la última letra, asigna puntajes y descuentos por cada equivocación o acierto.
 * 
 * Profe ya no aguanto estar despierto 2 dias seguidos nomas me falto puntajes y actualizar imagen cada vez que falle
 * pero en teoria esta bien asi q a momir
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ahorcado {

    private JFrame interfaz;
    Border borderinterfaz = BorderFactory.createLineBorder(new Color(255, 165, 82), 2);
    Border borderboton = BorderFactory.createLineBorder(new Color(0, 0, 0), 2);

    public Ahorcado() {
        game();
    }

    private void game() {
        interfaz = new JFrame();
        ImageIcon imagen = new ImageIcon("ahorcado.png");

        interfaz.setTitle("Presentado");
        interfaz.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        interfaz.setSize(650, 700);
        interfaz.setResizable(false);
        interfaz.setIconImage(imagen.getImage());
        interfaz.getContentPane().setBackground(new Color(255, 165, 82));
        interfaz.getRootPane().setBorder(borderinterfaz);
        interfaz.setLocationRelativeTo(null);

        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 50));
        labelPanel.setBackground(new Color(255, 165, 82));

        JLabel[] labels = {
                new JLabel("\"Ahorcado\""),
                new JLabel("Creado por:"),
                new JLabel("Carballo Itan")
        };

        for (JLabel label : labels) {
            label.setFont(new Font("Times New Roman", Font.ITALIC | Font.BOLD, 50));
            label.setPreferredSize(new Dimension(400, 100));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            labelPanel.add(label);
        }

        JButton continuar = new JButton("CONTINUAR");
        continuar.setFont(new Font("Verdana", Font.BOLD, 25));
        continuar.setPreferredSize(new Dimension(400, 40));
        continuar.setBackground(new Color(255, 137, 123));
        continuar.setBorder(borderboton);
        continuar.setFocusable(false);
        continuar.addActionListener(e -> menu());

        interfaz.setLayout(new BorderLayout());
        interfaz.add(labelPanel, BorderLayout.CENTER);
        interfaz.add(continuar, BorderLayout.SOUTH);
        interfaz.setVisible(true);
    }

    private void menu() {
        interfaz.setTitle("Menu");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(650, 700);
        interfaz.setLocationRelativeTo(null);

        JLabel label = new JLabel("Elige la opción a jugar:");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setPreferredSize(new Dimension(400, 50));
        label.setBackground(new Color(255, 165, 82));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel menu = new JPanel(new GridBagLayout());
        menu.setBackground(new Color(255, 165, 82));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 50, 0);
        JButton botonFacil = new JButton("Facil");
        JButton botonMedio = new JButton("Medio");
        JButton botonDificil = new JButton("Dificil");
        JButton botonSalir = new JButton("Salir");

        JButton[] botones = { botonFacil, botonMedio, botonDificil, botonSalir };

        for (JButton boton : botones) {
            boton.setFocusable(false);
            boton.setBackground(new Color(240, 255, 151));
            boton.setForeground(Color.BLACK);
            boton.setFont(new Font("Comic Sans", Font.BOLD, 25));
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            boton.setPreferredSize(new Dimension(250, 50));
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String comando = e.getActionCommand();
                    switch (comando) {
                        case "Facil":
                            Facilito();
                            break;
                        case "Medio":
                            Medio();
                            break;
                        case "Dificil":
                            Dificilito();
                            break;
                        case "Salir":
                            int respuesta = JOptionPane.showConfirmDialog(interfaz, "¿Estás seguro de querer salir?",
                                    "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (respuesta == JOptionPane.YES_OPTION) {
                                interfaz.dispose();
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(interfaz, "Por favor elige una opción correcta",
                                    "Advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                }
            });
            menu.add(boton, gbc);
            gbc.gridy++;
        }

        interfaz.setLayout(new BorderLayout());
        interfaz.add(label, BorderLayout.NORTH);
        interfaz.add(menu, BorderLayout.CENTER);
        interfaz.setVisible(true);
    }

    private String[] pistarandom;
    private char[] letrasAdivinadas;
    private int cantidadintentos;
    private int cantidadpistas;

    private void Facilito() {
        JOptionPane.showMessageDialog(interfaz, 
            "Reglas:\n-Tendras 3 pistas cada vez q falles (las pistas se iran revelando dependiendo del modo)\n-Si llegas a 0 intentos pierdes automaticamente\n-Solo tendras que ingresar LETRAS\n-No falles (obligatorio)",
            "Advertencia", JOptionPane.WARNING_MESSAGE);
        int maximointentos = 10;
        String[] palabras = { "camara", "estudio", "libreta", "boligrafo", "elefante", "girafa", "teclado", "monitor",
                "ventana", "cocina" };
        String[][] pistas = {
                { "Se usa en fotografía", "Empieza por la letra c", "Termina por la letra a" },
                { "Se usa para aprender", "Empieza por la letra e", "Termina por la letra o" },
                { "Se puede llevar en una mochila", "Empieza por la letra l", "Termina por la letra a" },
                { "Se usa en la escuela o la oficina", "Empieza por la letra b", "Termina por la letra o" },
                { "Tiene una trompa larga", "Empieza por la letra e", "Termina por la letra e" },
                { "Tiene un cuello largo", "Empieza por la letra g", "Termina por la letra a" },
                { "Se usa con una computadora", "Empieza por la letra t", "Termina por la letra o" },
                { "Muestra información visual de una computadora", "Empieza por la letra m", "Termina por la letra r" },
                { "Permite ver hacia afuera", "Empieza por la letra v", "Termina por la letra a" },
                { "Se usa cuando hay hambre", "Empieza por la letra c", "Termina por la letra a" }
        };

        Random random = new Random();
        int indicerandom = random.nextInt(palabras.length);
        String palabraAleatoria = palabras[indicerandom];
        pistarandom = pistas[indicerandom];
        letrasAdivinadas = new char[palabraAleatoria.length()];
        Arrays.fill(letrasAdivinadas, '_');

        cantidadintentos = 0;
        cantidadpistas = 0;

        interfaz.setTitle("Ahorcado - Dificultad Facilito");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(650, 550);
        interfaz.setLocationRelativeTo(null);
        //interfaz.addWindowListener(Cerrar);

        ImageIcon imagen = new ImageIcon("bg.png");
        imagen.setImage(imagen.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel labelImagen = new JLabel(imagen);

        JLabel palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 24));

        JLabel intentosLabel = new JLabel();
        intentosLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 16));

        JTextField letraIngresada = new JTextField(1);

        JButton adivinar = new JButton("ADIVINAR");
        adivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cantidadintentos < maximointentos && new String(letrasAdivinadas).contains("_")) {
                    String textoIngresado = letraIngresada.getText();
                    if (textoIngresado.length() == 1 && Character.isLetter(textoIngresado.charAt(0))) {
                        char letra = letraIngresada.getText().charAt(0);

                        if (palabraAleatoria.contains(String.valueOf(letra))) {
                            for (int i = 0; i < palabraAleatoria.length(); i++) {
                                if (palabraAleatoria.charAt(i) == letra) {
                                    letrasAdivinadas[i] = letra;
                                }
                            }
                        } else {
                            cantidadintentos++;
                            if (cantidadintentos == 3 || cantidadintentos == 6 || cantidadintentos == 9) {
                                if (cantidadpistas < pistarandom.length) {
                                    JOptionPane.showMessageDialog(interfaz, "pista: " + pistarandom[cantidadpistas]);
                                    cantidadpistas++;
                                }
                            }
                        }

                        letraIngresada.setText("");
                        StringBuilder palabraVisible = new StringBuilder();
                        for (char c : letrasAdivinadas) {
                            palabraVisible.append(c).append(' ');
                        }
                        palabraLabel.setText("Palabra: " + palabraVisible.toString());
                        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

                        if (!new String(letrasAdivinadas).contains("_")) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "¡Felicidades! Has adivinado la palabra: " + palabraAleatoria);
                            int respuesta = JOptionPane.showConfirmDialog(interfaz, "¿Quieres jugar de nuevo?",
                                    "Jugar de nuevo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (respuesta == JOptionPane.YES_OPTION) {
                                Facilito();
                            } else {
                                menu();
                            }
                        } else if (cantidadintentos == maximointentos) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "Lo siento, has agotado tus intentos. La palabra era: " + palabraAleatoria);
                            menu();
                        }
                    } else {
                        JOptionPane.showMessageDialog(interfaz, "Por favor, ingresa una letra válida.");
                    }
                }
            }
        });

        StringBuilder palabraVisible = new StringBuilder();
        for (char c : letrasAdivinadas) {
            palabraVisible.append(c).append(' ');
        }
        palabraLabel.setText("Palabra: " + palabraVisible.toString());
        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

        JPanel panelCompleto = new JPanel();
        panelCompleto.setBackground(new Color(255, 165, 82));
        panelCompleto.setLayout(new BorderLayout());
        panelCompleto.add(labelImagen, BorderLayout.NORTH);
        panelCompleto.add(palabraLabel, BorderLayout.CENTER);
        panelCompleto.add(intentosLabel, BorderLayout.SOUTH);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(letraIngresada, BorderLayout.CENTER);
        panelInferior.add(adivinar, BorderLayout.EAST);

        interfaz.add(panelCompleto, BorderLayout.CENTER);
        interfaz.add(panelInferior, BorderLayout.SOUTH);

        interfaz.setVisible(true);
    }

    private void Medio() {
        JOptionPane.showMessageDialog(interfaz, 
            "Reglas:\n-Tendras 3 pistas cada vez q falles (las pistas se iran revelando dependiendo del modo)\n-Si llegas a 0 intentos pierdes automaticamente\n-Solo tendras que ingresar LETRAS\n-No falles (obligatorio)",
            "Advertencia", JOptionPane.WARNING_MESSAGE);
        int maximointentos = 8;
        String[] palabras = { "descubrir", "aeropuerto", "mariposas", "estrellas", "espectaculo",
                "confianza", "motivacion", "diversion", "educacion", "comunidad" };
        String[][] pistas = {
                { "Empieza por la letra d", "Se utiliza cuando se aprende algo nuevo", "Termina por la letra r" },
                { "Empieza por la letra a", "Es un lugar donde los aviones despegan y aterrizan",
                        "Termina por la letra o" },
                { "Empieza por la letra m", "Son insectos voladores con alas grandes y coloridas",
                        "Termina por la letra s" },
                { "Empieza por la letra e",
                        "Son cuerpos celestes que emiten luz y calor debido a las reacciones nucleares en su núcleo",
                        "Termina por la letra s" },
                { "Empieza por la letra e", "A menudo se lleva a cabo en un teatro o en un estadio",
                        "Termina por la letra o" },
                { "Empieza por la letra c", "Es esencial para las relaciones saludables y la autoestima positiva",
                        "Termina por la letra a" },
                { "Empieza por la letra m", "Es lo que impulsa a una persona a actuar o lograr algo",
                        "Termina por la letra n" },
                { "Empieza por la letra d", "A menudo se busca en el tiempo libre", "Termina por la letra n" },
                { "Empieza por la letra e", "Es el proceso de adquirir conocimientos, habilidades, valores y actitudes",
                        "Termina por la letra n" },
                { "Empieza por la letra c",
                        "Puede referirse a un vecindario, una ciudad, una escuela, una iglesia, etc.",
                        "Termina por la letra d" }
        };

        Random random = new Random();
        int indicerandom = random.nextInt(palabras.length);
        String palabraAleatoria = palabras[indicerandom];
        pistarandom = pistas[indicerandom];
        letrasAdivinadas = new char[palabraAleatoria.length()];
        Arrays.fill(letrasAdivinadas, '_');

        cantidadintentos = 0;
        cantidadpistas = 0;

        interfaz.setTitle("Ahorcado - Dificultad Medio");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(650, 550);
        interfaz.setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon("bg.png");
        imagen.setImage(imagen.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel labelImagen = new JLabel(imagen);

        JLabel palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 24));

        JLabel intentosLabel = new JLabel();
        intentosLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 16));

        JTextField letraIngresada = new JTextField(1);

        JButton adivinar = new JButton("ADIVINAR");
        adivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cantidadintentos < maximointentos && new String(letrasAdivinadas).contains("_")) {
                    String textoIngresado = letraIngresada.getText();
                    if (textoIngresado.length() == 1 && Character.isLetter(textoIngresado.charAt(0))) {
                        char letra = letraIngresada.getText().charAt(0);

                        if (palabraAleatoria.contains(String.valueOf(letra))) {
                            for (int i = 0; i < palabraAleatoria.length(); i++) {
                                if (palabraAleatoria.charAt(i) == letra) {
                                    letrasAdivinadas[i] = letra;
                                }
                            }
                        } else {
                            cantidadintentos++;
                            if (cantidadintentos == 2 || cantidadintentos == 4 || cantidadintentos == 6) {
                                if (cantidadpistas < pistarandom.length) {
                                    JOptionPane.showMessageDialog(interfaz, "pista: " + pistarandom[cantidadpistas]);
                                    cantidadpistas++;
                                }
                            }
                        }

                        letraIngresada.setText("");
                        StringBuilder palabraVisible = new StringBuilder();
                        for (char c : letrasAdivinadas) {
                            palabraVisible.append(c).append(' ');
                        }
                        palabraLabel.setText("Palabra: " + palabraVisible.toString());
                        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

                        if (!new String(letrasAdivinadas).contains("_")) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "¡Felicidades! Has adivinado la palabra: " + palabraAleatoria);
                            int respuesta = JOptionPane.showConfirmDialog(interfaz, "¿Quieres jugar de nuevo?",
                                    "Jugar de nuevo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (respuesta == JOptionPane.YES_OPTION) {
                                Facilito();
                            } else {
                                menu();
                            }
                        } else if (cantidadintentos == maximointentos) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "Lo siento, has agotado tus intentos. La palabra era: " + palabraAleatoria);
                            menu();
                        }
                    } else {
                        JOptionPane.showMessageDialog(interfaz, "Por favor, ingresa una letra válida.");
                    }
                }
            }
        });

        StringBuilder palabraVisible = new StringBuilder();
        for (char c : letrasAdivinadas) {
            palabraVisible.append(c).append(' ');
        }
        palabraLabel.setText("Palabra: " + palabraVisible.toString());
        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

        JPanel panelCompleto = new JPanel();
        panelCompleto.setBackground(new Color(255, 165, 82));
        panelCompleto.setLayout(new BorderLayout());
        panelCompleto.add(labelImagen, BorderLayout.NORTH);
        panelCompleto.add(palabraLabel, BorderLayout.CENTER);
        panelCompleto.add(intentosLabel, BorderLayout.SOUTH);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(letraIngresada, BorderLayout.CENTER);
        panelInferior.add(adivinar, BorderLayout.EAST);

        interfaz.add(panelCompleto, BorderLayout.CENTER);
        interfaz.add(panelInferior, BorderLayout.SOUTH);

        interfaz.setVisible(true);
    }

    private void Dificilito() {
        JOptionPane.showMessageDialog(interfaz, 
            "Reglas:\n-Tendras 3 pistas cada vez q falles (las pistas se iran revelando dependiendo del modo)\n-Si llegas a 0 intentos pierdes automaticamente\n-Solo tendras que ingresar LETRAS\n-No falles (obligatorio)",
            "Advertencia", JOptionPane.WARNING_MESSAGE);
        int maximointentos = 6;
        String[] palabras = { "internacional", "responsabilidad", "comunicacion", "concentracion", "participacion",
                "conservacion", "investigacion", "diversificacion", "colaboracion", "administracion" };
        String[][] pistas = {
                { "Empieza por la letra i", "Termina por la letra l", "Puede referirse a acuerdos, tratados, organizaciones, eventos deportivos, etc." },
                { "Empieza por la letra r", "Termina por la letra d", "Es un concepto importante en ética, derecho y gestión" },
                { "Empieza por la letra c", "Termina por la letra n", "Puede ser verbal (hablar), no verbal (gestos), escrita o visual" },
                { "Empieza por la letra c", "Termina por la letra n", "Es la acción o el poder de enfocar la atención o el pensamiento mental" },
                { "Empieza por la letra p", "Termina por la letra n", "Es el acto de tomar parte en una actividad o evento" },
                { "Empieza por la letra c", "Termina por la letra n", "Es la protección y preservación del medio ambiente natural" },
                { "Empieza por la letra i ", "Termina por la letra n", "Los métodos pueden incluir experimentos, encuestas, observaciones, entrevistas y más" },
                { "Empieza por la letra d", "Termina por la letra n", "Es la estrategia de aumentar la variedad para reducir el riesgo o aumentar el rendimiento" },
                { "Empieza por la letra c", "Termina por la letra n", "Es el acto de trabajar juntos para lograr un objetivo común" },
                { "Empieza por la letra a", "Termina por la letra n", "Incluye funciones como planificación, organización, dirección y control" }
        };

        Random random = new Random();
        int indicerandom = random.nextInt(palabras.length);
        String palabraAleatoria = palabras[indicerandom];
        pistarandom = pistas[indicerandom];
        letrasAdivinadas = new char[palabraAleatoria.length()];
        Arrays.fill(letrasAdivinadas, '_');

        cantidadintentos = 0;
        cantidadpistas = 0;

        interfaz.setTitle("Ahorcado - Dificultad Dificlito");
        interfaz.getContentPane().removeAll();
        interfaz.repaint();
        interfaz.setSize(650, 550);
        interfaz.setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon("bg.png");
        imagen.setImage(imagen.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel labelImagen = new JLabel(imagen);

        JLabel palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 24));

        JLabel intentosLabel = new JLabel();
        intentosLabel.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 16));

        JTextField letraIngresada = new JTextField(1);

        JButton adivinar = new JButton("ADIVINAR");
        adivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cantidadintentos < maximointentos && new String(letrasAdivinadas).contains("_")) {
                    String textoIngresado = letraIngresada.getText();
                    if (textoIngresado.length() == 1 && Character.isLetter(textoIngresado.charAt(0))) {
                        char letra = letraIngresada.getText().charAt(0);

                        if (palabraAleatoria.contains(String.valueOf(letra))) {
                            for (int i = 0; i < palabraAleatoria.length(); i++) {
                                if (palabraAleatoria.charAt(i) == letra) {
                                    letrasAdivinadas[i] = letra;
                                }
                            }
                        } else {
                            cantidadintentos++;
                            if (cantidadintentos == 1 || cantidadintentos == 3 || cantidadintentos == 5) {
                                if (cantidadpistas < pistarandom.length) {
                                    JOptionPane.showMessageDialog(interfaz, "pista: " + pistarandom[cantidadpistas]);
                                    cantidadpistas++;
                                }
                            }
                        }

                        letraIngresada.setText("");
                        StringBuilder palabraVisible = new StringBuilder();
                        for (char c : letrasAdivinadas) {
                            palabraVisible.append(c).append(' ');
                        }
                        palabraLabel.setText("Palabra: " + palabraVisible.toString());
                        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

                        if (!new String(letrasAdivinadas).contains("_")) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "¡Felicidades! Has adivinado la palabra: " + palabraAleatoria);
                            int respuesta = JOptionPane.showConfirmDialog(interfaz, "¿Quieres jugar de nuevo?",
                                    "Jugar de nuevo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                            if (respuesta == JOptionPane.YES_OPTION) {
                                Facilito();
                            } else {
                                menu();
                            }
                        } else if (cantidadintentos == maximointentos) {
                            JOptionPane.showMessageDialog(interfaz,
                                    "Lo siento, has agotado tus intentos. La palabra era: " + palabraAleatoria);
                            menu();
                        }
                    } else {
                        JOptionPane.showMessageDialog(interfaz, "Por favor, ingresa una letra válida.");
                    }
                }
            }
        });

        StringBuilder palabraVisible = new StringBuilder();
        for (char c : letrasAdivinadas) {
            palabraVisible.append(c).append(' ');
        }
        palabraLabel.setText("Palabra: " + palabraVisible.toString());
        intentosLabel.setText("Intentos restantes: " + (maximointentos - cantidadintentos));

        JPanel panelCompleto = new JPanel();
        panelCompleto.setBackground(new Color(255, 165, 82));
        panelCompleto.setLayout(new BorderLayout());
        panelCompleto.add(labelImagen, BorderLayout.NORTH);
        panelCompleto.add(palabraLabel, BorderLayout.CENTER);
        panelCompleto.add(intentosLabel, BorderLayout.SOUTH);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(letraIngresada, BorderLayout.CENTER);
        panelInferior.add(adivinar, BorderLayout.EAST);

        interfaz.add(panelCompleto, BorderLayout.CENTER);
        interfaz.add(panelInferior, BorderLayout.SOUTH);

        interfaz.setVisible(true);
    }


    /*
    Tengo que arreglar esto ya que aparece muchas veces
    WindowListener Cerrar = new WindowAdapter() { 
        @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(interfaz, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    menu();
                }
            }
    };*/

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ahorcado());
    }
}
