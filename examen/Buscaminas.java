/*
 * Construye un programa que permita jugar con tus amigos BUSCAMINAS. 
 * El juego deberá tener 1 sólo escenario con minas incrustadas como tu prefieras 
 * así como el tamaño de tu tablero , deberá tener la opción de indicarle al usuario 
 * cuando este una mina cerca  y cuando teclee una posición donde hay una mina el usuario perderá,
 * tendrá la opción de indicarle al usuario si desea repetir el juego. Si tu así lo prefieres las 
 * minas puedes ser incrustadas aleatoriamente con un RANDOM .


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buscaminas {
    
    private JFrame interfaz;

    public Buscaminas() {
        base();
    }

    private void base() {
        interfaz = new JFrame();
        ImageIcon imagen = new ImageIcon("buscaminas.png");

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
        new Buscaminas()
        );
    }
}
*/