public class AppendAFunc {
    public static void main(String[] args) {
        // - Create a string variable named `am` and assign the value `kuty` to it
        // - Write a function called `appendA` that gets a string as an input,
        //   appends an 'a' character to its end and returns with a string

        String am ="kuty";
        apppendA(am);
    }

    public static String apppendA(String word) {
        word += "a";
        return word;
    }
}
