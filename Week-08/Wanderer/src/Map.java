import java.util.ArrayList;
import java.util.List;

public class Map {
    byte[][] list = {
            {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
            {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0, 0, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 1, 0, 0}
        };

    public Map() {
        this.list=list;
    }

    public Map(List<Character> characterList) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                for (Character character: characterList) {
                    if (i*72  == character.charX && j*72 == character.charY){
                        list[j][i] = 1;
                    }
                    else{
                        list[j][i] = list[j][i];
                    }
                }

            }

        }
    }



    }
