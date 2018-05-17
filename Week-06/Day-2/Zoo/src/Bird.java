public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String haveSkin() {
        return " has feathers.";

    }

    @Override
    public void land() {
        System.out.println("The " + this.getName()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println("The " + this.getName()  +" is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("The " + this.getName() + " takes off.");
    }
}
