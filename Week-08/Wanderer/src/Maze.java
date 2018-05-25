import java.awt.*;

public class Maze {


    public void drawMaze(Map map, Graphics graphics, int startingPointX, int startingPointY) {
        for (int i = startingPointX; i < 10; i++) {
            for (int j = startingPointY; j < 10; j++) {
                if (map.list[j][i] == 0) {
                    PositionedImage image = new PositionedImage("./wanderer-java/img/floor.png", i * 72, j * 72);
                    image.draw(graphics);
                } else {
                    PositionedImage image = new PositionedImage("./wanderer-java/img/wall.png", i * 72, j * 72);
                    image.draw(graphics);
                }
            }
        }
    }
}
