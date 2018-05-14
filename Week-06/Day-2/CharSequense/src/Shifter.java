public class Shifter implements CharSequence {
    String word;


    public Shifter(String word, int number) {
        this.word = word.substring(number) + word.substring(0, number);

    }



    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.word.subSequence(start, end);
    }
}
