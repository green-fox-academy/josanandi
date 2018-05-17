
public class Helicopter extends Vehicle implements Flyable{
    public Helicopter(String name, int howManyTyres, String usedOnSurface ) {
        super(name, howManyTyres, usedOnSurface);
    }

    @Override
    public void move() {
        System.out.println("It flies.");
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing");
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("The helicopter takes off.");
    }

    public static void main(String[] args) {
        Helicopter nonMilitary = new Helicopter("Heli1", 0, "Air");
        nonMilitary.fly();
        nonMilitary.land();

    }
}
