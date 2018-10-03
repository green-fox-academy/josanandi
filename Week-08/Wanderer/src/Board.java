import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Board extends JComponent implements KeyListener {
    Map map = new Map();
    Maze maze = new Maze();
    ListOfCharacters gameList = new ListOfCharacters();

    Hero me = new Hero();

    Boss boss = new Boss(map);

    HordOfSkeletons hord = new HordOfSkeletons();

    int counter = 0;
    int startingPointX = 0;
    int startingPointY = 0;




    public Board() {
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

        maze.drawMaze(map, graphics, startingPointX, startingPointY);

        me.drawCharacter(graphics);
        gameList.theCharacters.add(me);
        gameList.theCharacters.add(boss);
        for (Skeleton skeleton:hord.lot) {
            gameList.theCharacters.add(skeleton);
        }


        for (Skeleton skeleton: hord.lot) {
            skeleton.drawCharacter(graphics);
        }
        Map disposableMap = new Map(gameList.theCharacters);

        boss.checkIfNotWall(disposableMap);
        boss.drawCharacter(graphics);



    }


    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to itq
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
            Map upToDateMap = new Map(gameList.theCharacters);
           me.checkIfCanMoveUp(upToDateMap);
           counter++;
           if (counter > 0 && counter % 2 == 0){
               boss.move(upToDateMap);
               for (Skeleton skeleton:hord.lot) { skeleton.move(upToDateMap);}
           }
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
           Map upToDateMap = new Map(gameList.theCharacters);
            me.checkIfCanMoveDown(upToDateMap);
            counter++;
            if (counter > 0 && counter % 2 == 0){
                boss.move(upToDateMap);
                for (Skeleton skeleton:hord.lot) { skeleton.move(upToDateMap);}
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            Map upToDateMap = new Map(gameList.theCharacters);
            me.checkIfCanMoveLeft(upToDateMap);
            counter++;
            if (counter > 0 && counter % 2 == 0){
                boss.move(upToDateMap);
                for (Skeleton skeleton:hord.lot) { skeleton.move(upToDateMap);}
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Map upToDateMap = new Map(gameList.theCharacters);
            me.checkIfCanMoveRight(upToDateMap);
            counter++;
            if (counter > 0 && counter % 2 == 0){
                boss.move(upToDateMap);
                for (Skeleton skeleton:hord.lot) { skeleton.move(upToDateMap);}
            }
        }



        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}