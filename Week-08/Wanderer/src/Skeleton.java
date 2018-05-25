import java.awt.*;

public class Skeleton extends Monsters {



    public Skeleton() {
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", monsterX, monsterY);
    }

    public Skeleton(Map map) {
        super(map);
    }

    @Override
    public void checkIfNotWall(Map map) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/skeleton.png", monsterX, monsterY);
    }
}