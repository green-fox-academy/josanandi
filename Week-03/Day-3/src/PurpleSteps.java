import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i <280;i+=20) {
                drawSteps(i, graphics);

        }

    }
    public static void drawSteps(int x, Graphics graphics){
        graphics.setColor(new Color(153,50,204));
        graphics.fillRect(x, x, 20,20);
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
