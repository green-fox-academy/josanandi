public class Flower extends Plant {
    String color;

    public Flower() {
        this.color = "yellow";
    }

    public Flower(String color) {
        this.color = color;
    }

    public void waterFlower(double amountForWatering) {
        super.waterAmount += amountForWatering * 0.75;
        checkIfPlantNeedsWater();
    }

    public boolean checkIfPlantNeedsWater() {
        if (super.waterAmount < 5) {
            super.needsWater = true;
        }
        else{
            super.needsWater = false;
        }
        return super.needsWater;
    }
}
