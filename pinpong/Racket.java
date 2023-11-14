import java.awt.Graphics;
import java.awt.Rectangle;

public class Racket {
    private static final int WIDTH = 10, HEIGHT = 60;
    private Pong game;
    private int up, down;
    private int x;
    private int y;
    private double ya;

    public Racket(Pong game, int up, int down, int x) {
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
    }

    public void update() {
        y += ya;

        if (y < 0) {
            y = 0;
        } else if (y > game.getHeight() - HEIGHT - 31) {
            y = game.getHeight() - HEIGHT - 31;
        }
    }

    public void pressed(int keyCode) {
        if (keyCode == up)
            ya = -2.5;
        else if (keyCode == down)
            ya = 2.5;
    }

    public void released(int keyCode) {
        if (keyCode == up || keyCode == down)
            ya = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}