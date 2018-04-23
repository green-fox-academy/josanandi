import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles{

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        graphics.setColor(Color.GREEN);
        graphics.drawRect(25,25, 50, 59);

        graphics.setColor(Color.RED);
        graphics.drawRect(58,56, 20, 120);

        graphics.setColor(Color.BLUE);
        graphics.drawRect(120,30, 75, 25);

        graphics.setColor(Color.YELLOW);
        graphics.drawRect(250,120, 25, 128);


    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}