import java.awt.*;

public class Skeleton extends Monsters {


    public Skeleton() {
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
    }

    public Skeleton(Map map) {
        super(map);
    }

    @Override
    public void checkIfNotWall(Map map) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
    }

    @Override
    public void move(Map map) {
        int trialX;
        int trialY;
        int number = (int) ((Math.random()) * 4);

        if (number == 0) {
            trialX = super.charX+ 72;
            trialY = super.charY;
            if (checkIfCanMove(map, trialX, trialY)) {
                super.charX = trialX;
                characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
            } else {
                move(map);
            }
        } else if (number == 1) {
            trialX = super.charX - 72;
            trialY = super.charY;
            if (checkIfCanMove(map, trialX, trialY)) {
                super.charX = trialX;
                characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
            } else {
                move(map);
            }
        } else if (number == 2) {
            trialX = super.charX;
            trialY = super.charY + 72;
            if (checkIfCanMove(map, trialX, trialY)) {
                super.charY = trialY;
                characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
            } else {
                move(map);
            }
        } else if (number == 3) {
            trialX = super.charX;
            trialY = super.charY - 72;
            if (checkIfCanMove(map, trialX, trialY)) {
                super.charY = trialY;
                characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", super.charX, super.charY);
            } else {
                move(map);
            }
        }
    }
}