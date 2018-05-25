import java.awt.*;

public abstract class Monsters extends Character{
    int monsterX;
    int monsterY;


    public Monsters() {
    }

    public Monsters(Map map) {
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

    @Override
    public void drawCharacter(Graphics graphics) {
        characterMove.draw(graphics);
    }

    public int createRandomStartingPoint() {
        int number = (int) (Math.random() * 10);
        return number;
    }

    public void checkIfNotWall(Map map) {
        }


    public boolean checkIfCanMove(Map map, int x, int y){
        boolean canMove = false;

        int i = (x)/72;
        int j = (y)/72;

        boolean checkIfOnBoardX = (x >=0) && (x < 720);
        boolean checkIfOnBoardY = (y >=0) && (y < 720);

        if (checkIfOnBoardX && checkIfOnBoardY && (map.list[j][i] == 0)){
            canMove = true;
        }
        return canMove;
    }


    public abstract void move(Map map);
}
