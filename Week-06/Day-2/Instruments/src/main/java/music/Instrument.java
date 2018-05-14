package main.java.music;

abstract public class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void play();
}
