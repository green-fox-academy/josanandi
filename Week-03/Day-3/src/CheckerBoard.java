import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int j = 0; j <=320; j+=40) {
            if (j%80 == 0) {
                chessBoardBlack(j, graphics);
            }
            else{
                chessBoardWhite(j,graphics);
            }
        }
        }

    public static void chessBoardBlack(int x, Graphics graphics) {
        for (int i = 0; i < 320; i += 80) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(i, x, 40, 40);
        }
    }

    public static void chessBoardWhite(int x, Graphics graphics) {
        for (int i = 0; i < 320; i += 80) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(i+40, x, 40, 40);
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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