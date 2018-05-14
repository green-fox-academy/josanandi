public class CharSquense {
    public static void main(String[] args) {
        Gnirts word1 = new Gnirts("trambulin");

        System.out.println(word1.length());
        System.out.println(word1.charAt(0));
        System.out.println(word1.subSequence(5,8));

        Shifter word2 = new Shifter("word", 2);
        for (int i = 0; i <word2.length() ; i++) {
            System.out.println(word2.charAt(i));
        }

        System.out.println(word2.subSequence(0,2));
    }
}
