import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> shipList;

    public Armada() {
        shipList = new ArrayList<>();
    }

    public boolean war(Armada otherArmada){
        int i = 0;
        int j = 0;
        boolean conditionOfTheArmadaBattle =false;

        while (i<this.shipList.size() && j<otherArmada.shipList.size()){
            boolean conditionOfTheSingleBattle = this.shipList.get(i).battle(otherArmada.shipList.get(j));
            if(conditionOfTheSingleBattle){
                j++;
            }
            else{
                i++;
            }

            if (i == this.shipList.size()){
                conditionOfTheArmadaBattle=false;
            }
            else if (j == otherArmada.shipList.size()){
                conditionOfTheArmadaBattle = true;
            }
        }
        return conditionOfTheArmadaBattle;
    }

}
