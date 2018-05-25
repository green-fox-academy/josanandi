import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HordOfSkeletons {
    List<Skeleton> lot;
    Map map = new Map();

    public HordOfSkeletons() {
        this.lot = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Skeleton skeleton = new Skeleton(map);
            skeleton.checkIfNotWall(map);
            lot.add(skeleton);
        }
    }


}
