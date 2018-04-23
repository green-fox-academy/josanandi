import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        for (int i = 0; i < 320; i++) {
            int x = (int) (Math.random() * 320);
            int[] colors = {(int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)};
            rainbowBoxFunction(x, colors, graphics);
        }
    }
    public static void rainbowBoxFunction(int x, int[] colors, Graphics graphics) {
        graphics.setColor(new Color(colors[0], colors[1], colors[2]));
        graphics.drawRect(WIDTH/2-x/2, HEIGHT/2-x/2, x, x);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}