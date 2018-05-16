public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return " pushing miniature versions out.";
    }

    @Override
    public String haveSkin() {
        return " has fur, which primary usage is thermoregulation.";
    }
}
