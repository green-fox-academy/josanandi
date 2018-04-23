import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNigth {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,320,343);

        for (int i = 0; i <320 ; i++) {
            starGenerator(graphics);

        }

    }
    public static void starGenerator( Graphics graphics){
        int x = (int)(Math.random()*320);
        int y = (int)(Math.random()*343);
        int color = (int)(Math.random()*255);
        int size = (int)(Math.random()*10);

        graphics.setColor(new Color(color, color, color));
        graphics.fillRect(x, y, size, size);

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