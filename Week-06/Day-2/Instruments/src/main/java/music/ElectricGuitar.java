package main.java.music;

public class ElectricGuitar extends StringedInstruments {


    public ElectricGuitar() {
        super("Electric Guitar");
        super.numberOfStrings = 6;

    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar");
        super.numberOfStrings = numberOfStrings;}

    @Override
    String sound() {
        return "Twang";
    }
}
