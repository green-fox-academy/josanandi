public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = (float) 100;
    }

    public void use(){
        if (this.inkAmount == 0){
            System.out.println("Sharpie is empty, can't use");
        }
        else if (this.inkAmount < 10){
            this.inkAmount=0;
        }
        else{
            this.inkAmount -= (float) 10;
        }
    }

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("pink", (float) 0.5);
        sharpie1.use();
        System.out.println("The printing color is: " + sharpie1.color + "The ink amount remaining is: " + sharpie1.inkAmount);
    }
}