public class Boss extends Monsters {

    public Boss() {
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }

    @Override
    public void checkIfNotWall(Map map ) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }
}
