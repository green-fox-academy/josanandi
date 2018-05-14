public class Domino implements Comparable {
    private final int[] values;
    private Object domino1;
    private Object domino2;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Object o) {
        return (this.values[0]-((Domino)o).values[0]);
    }


}