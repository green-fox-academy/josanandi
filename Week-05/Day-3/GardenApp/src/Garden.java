import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> allPlants;

    public Garden() {
        this.allPlants = new ArrayList<>();
    }

    public void waterPlants(int allAmountOfWater){
        int counterThirstyPlants = 0;
        double amountofWaterPerPlant = 0;

        for (Plant plant: allPlants) {

            if (plant instanceof Flower && ((Flower) plant).checkIfPlantNeedsWater()){
                counterThirstyPlants++;
            }
            else if((plant instanceof Tree && ((Tree) plant).checkIfPlantNeedsWater())){
                counterThirstyPlants++;

            }
         }

        if (counterThirstyPlants != 0 ) {
            amountofWaterPerPlant = allAmountOfWater / counterThirstyPlants;
        }

        for (Plant plant: allPlants) {
            if (plant instanceof Flower && plant.needsWater){

                ((Flower) plant).waterFlower(amountofWaterPerPlant);
            }
            else if (plant instanceof Tree && plant.needsWater){

                ((Tree)plant).waterTree(amountofWaterPerPlant);
            }

        }
       }

    @Override
    public String toString() {
        String stringToReturn="";
        for ( Plant plant: allPlants) {
            if (plant instanceof Flower && plant.needsWater){

                 stringToReturn += "The " +  ((Flower) plant).color + " Flower needs water."+ "\n";
            }
            else if(plant instanceof Tree && plant.needsWater) {
                stringToReturn += "The " +  ((Tree) plant).color + " Tree needs water."+ "\n";
            }
            else if(plant instanceof Flower && !plant.needsWater){
                stringToReturn+= "The " +  ((Flower) plant).color + " Flower doesn't need water."+ "\n";
            }
            else if(plant instanceof Tree && !plant.needsWater) {
                stringToReturn += "The " +  ((Tree) plant).color + " Tree doesn't need water."+ "\n";
            }

        }
        return stringToReturn;

    }
}
