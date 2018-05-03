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
        this.inkAmount -= (float) 5;
    }

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("pink", (float) 0.5);
        sharpie1.use();
        System.out.println("The printing color is: " + sharpie1.color + "The ink amount remaining is: " + sharpie1.inkAmount);
    }
}
