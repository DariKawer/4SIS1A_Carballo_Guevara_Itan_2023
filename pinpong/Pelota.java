import java.awt.*;
import javax.swing.*;

public class Pelota {
    private static final int ANCHO = 30;
    private static final int ALTO = 30;

    private Pong paneljuego;
    private int x, y;
    private double xa = 1, ya = 1;

    private static final double VELOCIDAD_FACIL = 1;
    private static final double VELOCIDAD_MEDIO = 2;
    private static final double VELOCIDAD_DIFICIL = 4;

    private double velocidad;

    public Pelota(Pong paneljuego) {
        this.paneljuego = paneljuego;
        x = paneljuego.getWidth() / 2;
        y = paneljuego.getHeight() / 2;
        
        establecerVelocidadMedio();
    }

    public void establecerVelocidadFacil() {
        velocidad = VELOCIDAD_FACIL;
    }

    public void establecerVelocidadMedio() {
        velocidad = VELOCIDAD_MEDIO;
    }

    public void establecerVelocidadDificil() {
        velocidad = VELOCIDAD_DIFICIL;
    }

    public void pelotitaActualizar() {
        x += xa * velocidad;
        y += ya * velocidad;

        colisionesPared();
        checarMetio();
        checarGano();

        checarColisiones();
    }

    private void colisionesPared() {
        if (x < 0 || x > paneljuego.getWidth() - ANCHO - 7) {
            xa = -xa;
        }

        if (y < 0 || y > paneljuego.getHeight() - ALTO - 29) {
            ya = -ya;
        }
    }

    private void checarMetio() {
        if (x < 0 || x > paneljuego.getWidth() - ANCHO - 7) {
            int jugadorPuntaje = (x < 0) ? 2 : 1;
            paneljuego.getPanel().aumentarpuntaje(jugadorPuntaje);
            reinciarPelotita();
        }
    }

    private void checarGano() {
        int player1Score = paneljuego.getPanel().getPuntaje(1);
        int player2Score = paneljuego.getPanel().getPuntaje(2);

        if (player1Score == 3 || player2Score == 3) {
            if (paneljuego.getPanel().getPuntaje(1) == 3 || paneljuego.getPanel().getPuntaje(2) == 3) {
                String ganadortext = (paneljuego.getPanel().getPuntaje(1) == 3) ? "Jugador 1 ha ganado"
                        : "Jugador 2 ha ganado";
                int respuesta = JOptionPane.showConfirmDialog(null, ganadortext + "\n¿Quieres jugar de nuevo?", "Pong",
                        JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    reinciarPelotita();
                    resetearJuego();
                } else {
                    System.exit(0);
                }
            }

            checarColisiones();
        }
    }

    public void resetearJuego() {
        // Reinicia el juego
        paneljuego.getPanel().resetearPuntaje();
        paneljuego.getPanel().renaudar();
    }

    public void reinciarPelotita() {
        x = paneljuego.getWidth() / 2;
        y = paneljuego.getHeight() / 2;
        xa = -xa;
    }

    private void checarColisiones() {
        Rectangle ballBounds = getBounds();

        if (paneljuego.getPanel().getPlayer(1).getBounds().intersects(ballBounds)
                || paneljuego.getPanel().getPlayer(2).getBounds().intersects(ballBounds)) {
            xa = -xa;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ANCHO, ALTO);
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, ANCHO, ALTO);
        g.setColor(new Color(16, 16, 150));
    }
}
