import java.awt.*;

public class Skeleton extends Character {
    int skeletonX;
    int skeletonY;

    public Skeleton() {
        this.skeletonX = createRandomStartingPoint() * 72;
        this.skeletonY = createRandomStartingPoint() * 72;
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", skeletonX, skeletonY);
    }

    @Override
    public void drawCharacter(Graphics graphics) {
        characterMove.draw(graphics);
    }

    public int createRandomStartingPoint() {
        int number = (int) (Math.random() * 10);
        return number;
    }

    public void checkIfNotWallOrCharacter(Map map) {
        int i = (skeletonX) / 72;
        int j = (skeletonY) / 72;

        if ((map.list[j][i] != 0)) {
            this.skeletonX = createRandomStartingPoint() * 72;
            this.skeletonY = createRandomStartingPoint() * 72;
            checkIfNotWallOrCharacter(map);
        }
    }
}