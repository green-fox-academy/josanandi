public class Gnirts implements CharSequence{
    String word;

    public Gnirts(String word) {
        this.word = word;
    }

    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(this.word.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String sequence = "";
        for (int i = this.word.length()-start-1; i >this.word.length()-end-1 ; i--) {
            sequence += this.word.charAt(i);
        }
        return sequence;
    }
}
