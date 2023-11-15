import java.awt.*;

public class Racket {
    private static final int ANCHO = 10;
    private static final int ALTO = 60;
    private static final double VELOCIDAD = 2;

    private Pong paneljuego;
    private int upKey, downKey;
    private int x, y;
    private double ya;

    private static final double VELOCIDAD_FACIL = 6;
    private static final double VELOCIDAD_MEDIO = 3;
    private static final double VELOCIDAD_DIFICIL = 2;

    private double velocidad;

    public Racket(Pong paneljuego, int upKey, int downKey, int x) {
        this.paneljuego = paneljuego;
        this.x = x;
        y = paneljuego.getHeight() / 2;
        this.upKey = upKey;
        this.downKey = downKey;
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

    public void raquetaActualizar() {
        y += ya * velocidad;

        if (y < 0) {
            y = 0;
        } else if (y > paneljuego.getHeight() - ALTO - 31) {
            y = paneljuego.getHeight() - ALTO - 31;
        }
    }

    public void pressed(int keyCode) {
        if (keyCode == upKey) {
            ya = -VELOCIDAD;
        } else if (keyCode == downKey) {
            ya = VELOCIDAD;
        }
    }

    public void released(int keyCode) {
        if (keyCode == upKey || keyCode == downKey) {
            ya = 0;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ANCHO, ALTO);
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, ANCHO, ALTO);
    }
}
