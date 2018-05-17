abstract public class Vehicle {
    private String name;
    private int howManyTyres;
    private String usedOnSurface;

    public Vehicle(String name, int howManyTyres, String usedOnSurface) {
        this.name = name;
        this.howManyTyres = howManyTyres;
        this.usedOnSurface = usedOnSurface;
    }

    abstract public void move();
}
