/*
 * Construye un programa que permita jugar el juego del GATO, 
 * solo pueden tirar 2 jugadores tendrá la opción para que juegues contra la máquina, 
 * hay que volver a correr el programa de nuevo cada vez que gana alguno de los jugadores  o se empata.
*/

import javax.swing.*;
import java.awt.*;

public class Gato {
    
    private JFrame interfaz;

    public Gato() {
        base();
    }

    private void base() {
        interfaz = new JFrame();
        ImageIcon imagen = new ImageIcon("gato.png");

        interfaz.setTitle("Inicio");
        interfaz.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        interfaz.setSize(650, 700);
        interfaz.setResizable(false);
        interfaz.setIconImage(imagen.getImage());
        interfaz.getContentPane().setBackground(new Color(255, 165, 82));

        interfaz.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> 
        new Gato()
        );
    }

}
