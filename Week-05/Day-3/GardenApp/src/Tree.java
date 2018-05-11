public class Tree extends Plant {
    String color;

    public Tree() {
        this.color = "purple";
    }

    public Tree(String color) {
        this.color = color;
    }
    public void waterTree(double amountForWatering){
        super.waterAmount +=amountForWatering*0.4;
        checkIfPlantNeedsWater();
    }
    public boolean checkIfPlantNeedsWater(){
        if (super.waterAmount < 10){
            super.needsWater=true;
        }
        else{
            super.needsWater = false;
        }
        return super.needsWater;
    }
}
