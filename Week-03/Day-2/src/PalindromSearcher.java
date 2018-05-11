public class PalindromSearcher {
    public static void main(String[] args) {
        checkTheString("dog goat dad duck doodle never");
    }

    private static String palindromeSearcher(String sequence){
        String reverse = "";
        for (int i = sequence.length()-1; i >=0 ; i--) {
            reverse += sequence.charAt(i);

        }
        if (sequence.equals(reverse)){
            return sequence;
        }
        else{
            return "";
        }
    }

    private static void checkTheString(String input){
        int sequenceLenght=3;
        while (sequenceLenght <= input.length()){
            for (int i = 0; i + sequenceLenght <= input.length() ; i ++) {
                String sequence = input.substring(i, i+sequenceLenght);
                if (!(palindromeSearcher(sequence).equals(""))){
                    System.out.println(palindromeSearcher(sequence));
            }
            }
            sequenceLenght ++;
        }
    }
}


