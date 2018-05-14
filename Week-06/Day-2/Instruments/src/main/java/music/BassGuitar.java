package main.java.music;

public class BassGuitar extends StringedInstruments{

    public BassGuitar() {
        super("Bass Guitar");
        super.numberOfStrings = 4;

    }

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar");
        super.numberOfStrings = numberOfStrings;

    }

    @Override
    String sound() {
        return "Duum-duum-duum";
    }

}
