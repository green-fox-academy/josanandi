package main.java.music;

abstract public class StringedInstruments extends Instrument {
    int numberOfStrings;

    public StringedInstruments(String name) {
        super(name);
    }

    public StringedInstruments(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    @Override
    public void play() {
        System.out.println(getName() + ", a " + numberOfStrings +"-stringed instrument that goes " + sound());
    }
}
