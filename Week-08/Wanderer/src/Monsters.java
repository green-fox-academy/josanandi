import java.awt.*;

public class Monsters extends Character{
    int monsterX;
    int monsterY;

    public Monsters() {
        this.monsterX = createRandomStartingPoint() * 72;
        this.monsterY = createRandomStartingPoint() * 72;
    }

    @Override
    public void drawCharacter(Graphics graphics) {
        characterMove.draw(graphics);
    }

    public int createRandomStartingPoint() {
        int number = (int) (Math.random() * 10);
        return number;
    }


    public void checkIfNotWall(Map map){
        boolean condition = false;

        while (!condition){

            int i = createRandomStartingPoint();
            int j = createRandomStartingPoint();

            if (map.list[j][i] == 0){
                condition = true;
                this.monsterX = i*72;
                this.monsterY = j*72;
                    }
            }


        }

    public void move(){

    }
}
