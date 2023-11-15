import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
    private Pong paneljuego;
    private Pelota pelotita;
    private Racket jugador1, jugador2;
    private int puntaje1, puntaje2;
    private boolean pausado;
    private Timer gameTimer;

    public PongPanel(Pong paneljuego) {
        setBackground(new Color(124, 195, 97));
        this.paneljuego = paneljuego;
        pelotita = new Pelota(paneljuego);
        jugador1 = new Racket(paneljuego, KeyEvent.VK_UP, KeyEvent.VK_DOWN, paneljuego.getWidth() - 36);
        jugador2 = new Racket(paneljuego, KeyEvent.VK_W, KeyEvent.VK_S, 20);

        gameTimer = new Timer(5, this);
        gameTimer.start();

        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    public Racket getPlayer(int jugadorNo) {
        return (jugadorNo == 1) ? jugador1 : jugador2;
    }

    public void aumentarpuntaje(int jugadorNo) {
        if (jugadorNo == 1)
            puntaje1++;
        else
            puntaje2++;
    }

    public int getPuntaje(int jugadorNo) {
        return (jugadorNo == 1) ? puntaje1 : puntaje2;
    }

    private void actualizar() {
        if (!pausado) {
            pelotita.pelotitaActualizar();
            jugador1.raquetaActualizar();
            jugador2.raquetaActualizar();
        }
    }

    private void verMenu() {
        pausa();

        String[] options = {"Facil", "Medio", "Dificil", "Salir"};
        int choice = JOptionPane.showOptionDialog(this, "Selecciona la dificultad o sal del juego:", "Esc para salir y para entrar o pulsa --->",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        gameTimer.stop();
        switch (choice) {
            case 0:
            pelotita.establecerVelocidadFacil();
            jugador1.establecerVelocidadFacil();
            jugador2.establecerVelocidadFacil();

            gameTimer = new Timer(15, this);
            gameTimer.start();

            pelotita.reinciarPelotita();
            pelotita.resetearJuego();
            break;
        case 1:
            pelotita.establecerVelocidadMedio();
            jugador1.establecerVelocidadMedio();
            jugador2.establecerVelocidadMedio();

            gameTimer = new Timer(14, this);
            gameTimer.start();

            pelotita.reinciarPelotita();
            pelotita.resetearJuego();
            break;
        case 2:
            pelotita.establecerVelocidadDificil();
            jugador1.establecerVelocidadDificil();
            jugador2.establecerVelocidadDificil();

            gameTimer = new Timer(12, this);
            gameTimer.start();

            pelotita.reinciarPelotita();
            pelotita.resetearJuego();
            break;
            case 3:
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer salir?", "Pong", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                renaudar();
                }
                break;
        }

        renaudar();
        gameTimer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        actualizar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            verMenu();
        } else {
            jugador1.pressed(e.getKeyCode());
            jugador2.pressed(e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jugador1.released(e.getKeyCode());
        jugador2.released(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

   
    
public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int jugador1Puntaje = getPuntaje(1);
    int jugador2Puntaje = getPuntaje(2);

    String puntajeText = String.format("Jugador 1: %d | Jugador 2: %d", jugador1Puntaje, jugador2Puntaje);
    g.drawString(puntajeText, paneljuego.getWidth() / 3 + 50, 10);

    pelotita.paint(g);
    jugador1.paint(g);
    jugador2.paint(g);
}


    public void pausa() {
        pausado = true;
    }

    public void renaudar() {
        pausado = false;
    }

    public void resetearPuntaje() {
        puntaje1 = 0;
        puntaje2 = 0;
    }
}
