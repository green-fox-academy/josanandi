import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {

    Hero me = new Hero();
    Skeleton skel1 = new Skeleton();

    int testBoxX;
    int testBoxY;
    int startingPointX = 0;
    int startingPointY =0;

    Map map = new Map();

    public Board() {
        testBoxX = startingPointX;
        testBoxY = startingPointY;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        //graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        int mapi;
        int mapj = 0;
        for (int i = startingPointX; i < 720; i += 72) {
            mapi=0;
            for (int j = startingPointY; j < 720; j += 72) {

                if (map.list[mapi][mapj] == 0) {
                    PositionedImage image = new PositionedImage("./wanderer-java/img/floor.png", i, j);
                    image.draw(graphics);
                    }
                    else {
                        PositionedImage image = new PositionedImage("./wanderer-java/img/wall.png", i, j);
                        image.draw(graphics);
                        }
                mapi++;
                }
                mapj++;
            }
        me.drawCharacter(graphics);
        skel1.checkIfNotWallOrCharacter(map);
        skel1.drawCharacter(graphics);

    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
           me.checkIfCanMoveUp(map);
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            me.checkIfCanMoveDown(map);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            me.checkIfCanMoveLeft(map);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            me.checkIfCanMoveRight(map);
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}