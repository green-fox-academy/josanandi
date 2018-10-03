import java.awt.*;
import java.awt.event.KeyEvent;

abstract public class Character {
    long maxHealthPoints;
    long currentHealthPoints;

    long defendPoints;
    long strikePoints;

    int charX;
    int charY;

    PositionedImage characterMove;

    public Character() {
    }



    public abstract void drawCharacter(Graphics graphics);

}
