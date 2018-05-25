import java.util.ArrayList;
import java.util.List;

public class HordOfSkeletons {
    List<Skeleton> lot;

    public HordOfSkeletons() {
        this.lot = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Skeleton skeleton = new Skeleton();
            lot.add(skeleton);
        }
    }
}
