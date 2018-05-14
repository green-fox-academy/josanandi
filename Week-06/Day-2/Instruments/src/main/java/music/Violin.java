package main.java.music;

public class Violin extends StringedInstruments{
    public Violin() {
        super("Violin");
        super.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super("Violin");
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return "Screech";
    }
}
