import java.awt.*;

public class Skeleton extends Monsters {



    public Skeleton() {
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", monsterX, monsterY);
    }

    @Override
    public void checkIfNotWall(Map map) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", monsterX, monsterY);
    }
}