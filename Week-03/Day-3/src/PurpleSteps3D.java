import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        int size =20;
        for (int i = 0; i <300;i+=size) {
            drawSteps(i-size, size, graphics);
            size+=10;

        }

    }
    public static void drawSteps(int x, int size, Graphics graphics){
        graphics.setColor(new Color(153,50,204));
        graphics.fillRect(x, x, size, size  );
        graphics.draw3DRect(x, x, size,size, true);
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
