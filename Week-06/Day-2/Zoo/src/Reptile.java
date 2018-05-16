public class Reptile extends Animal{
    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String  haveSkin() {
        return " has a horny epidermis, making it watertight and enabling reptiles to live on dry land";

    }
}
