public class Boss extends Monsters {

    public Boss() {
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }

    public Boss(Map map) {
        super(map);
    }

    @Override
    public void checkIfNotWall(Map map ) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }
}
