import org.w3c.dom.events.EventException;

import java.awt.*;


public class Hero extends Character {





    public Hero() {
        super.charX = 0;
        super.charY = 0;
        this.characterMove = new PositionedImage("./wanderer-java/img/hero-down.png", super.charX, super.charY);
    }


    @Override
    public void drawCharacter(Graphics graphics) {
        characterMove.draw(graphics);
    }
    public void moveUp() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-up.png", super.charX, super.charY);
    }
    public void moveDown() {
       characterMove = new PositionedImage("./wanderer-java/img/hero-down.png", super.charX, super.charY);
    }
    public void moveLeft() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-left.png", super.charX, super.charY);
    }
    public void moveRight() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-right.png", super.charX, super.charY);
    }

    public void checkIfCanMoveUp(Map map){
        int i = (super.charX)/72;
        int j = (super.charY-72)/72;

        int coordinateToCheck = super.charY-72;

        if ((coordinateToCheck >= 0) && (map.list[j][i] == 0)){
            super.charY -= 72;
            this.moveUp();
        }
    }

    public void checkIfCanMoveDown(Map map){
        int i = (super.charX)/72;
        int j = (super.charY+72)/72;

        int coordinateToCheck = super.charY+72;

        if ((coordinateToCheck <= 720) && (j<10) && (map.list[j][i] == 0)){
            super.charY += 72;
            this.moveDown();
        }
    }

    public void checkIfCanMoveLeft(Map map){
        int i = (super.charX-72)/72;
        int j = (super.charY)/72;

        int coordinateToCheck = super.charX-72;

        if ((coordinateToCheck >= 0) && (map.list[j][i] == 0)){
            super.charX-= 72;
            this.moveLeft();
        }
    }
    public void checkIfCanMoveRight(Map map){
        int i = (super.charX+72)/72;
        int j = (super.charY)/72;
        int coordinateToCheck = super.charX+72;

        if ((coordinateToCheck <= 720) && (i<10) && (map.list[j][i] == 0)){
            super.charX += 72;
            this.moveRight();
        }
    }

  }



