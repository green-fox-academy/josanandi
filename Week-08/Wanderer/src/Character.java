import java.awt.*;
import java.awt.event.KeyEvent;

abstract public class Character {
    long maxHealthPoints;
    long currentHealthPoints;

    long defendPoints;
    long strikePoints;

    PositionedImage characterMove;

    public Character() {
    }


    public void die(){
        if (this.currentHealthPoints <= 0){
            //graphics.dispose();
        }
    }

    public abstract void drawCharacter(Graphics graphics);

}
