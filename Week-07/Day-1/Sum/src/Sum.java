import java.util.ArrayList;
import java.util.List;

public class Sum  {
    public List<Integer> getIntegerList() {
        return integerList;
    }

    private List<Integer> integerList;

    public Sum() {
        this.integerList = new ArrayList<>();
    }

    public int sum(){
        int total = 0;
        for (Integer number: this.getIntegerList() ){
            total += number;
        }
        return total;
    }
}
