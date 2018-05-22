import org.w3c.dom.events.EventException;

import java.awt.*;


public class Hero extends Character {


    int heroX = 0;
    int heroY = 0;


    public Hero() {
        this.characterMove = new PositionedImage("./wanderer-java/img/hero-down.png", heroX, heroY);
    }


    @Override
    public void drawCharacter(Graphics graphics) {
        characterMove.draw(graphics);
    }
    public void moveUp() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-up.png", heroX, heroY);
    }
    public void moveDown() {
       characterMove = new PositionedImage("./wanderer-java/img/hero-down.png", heroX, heroY);
    }
    public void moveLeft() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-left.png", heroX, heroY);
    }
    public void moveRight() {
        characterMove = new PositionedImage("./wanderer-java/img/hero-right.png", heroX, heroY);
    }

    public void checkIfCanMoveUp(Map map){
        int i = (heroX)/72;
        int j = (heroY-72)/72;

        int coordinateToCheck = heroY-72;

        if ((coordinateToCheck >= 0) && (map.list[j][i] == 0)){
            this.heroY -= 72;
            this.moveUp();
        }
    }

    public void checkIfCanMoveDown(Map map){
        int i = (heroX)/72;
        int j = (heroY+72)/72;

        int coordinateToCheck = heroY+72;

        if ((coordinateToCheck <= 720) && (j<10) && (map.list[j][i] == 0)){
            this.heroY += 72;
            this.moveDown();
        }
    }

    public void checkIfCanMoveLeft(Map map){
        int i = (heroX-72)/72;
        int j = (heroY)/72;

        int coordinateToCheck = heroX-72;

        if ((coordinateToCheck >= 0) && (map.list[j][i] == 0)){
            this.heroX -= 72;
            this.moveLeft();
        }
    }
    public void checkIfCanMoveRight(Map map){
        int i = (heroX+72)/72;
        int j = (heroY)/72;
        int coordinateToCheck = heroX+72;

        if ((coordinateToCheck <= 720) && (i<10) && (map.list[j][i] == 0)){
            this.heroX += 72;
            this.moveRight();
        }
    }

  }



