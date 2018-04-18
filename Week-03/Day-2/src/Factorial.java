public class Factorial {
    public static void main(String[] args){
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        int number = 3;

        System.out.println(factorio(number));


    }

    private static int factorio(int number) {
        int product = 1;
        for (int i = 1; i <= number ; i++) {
            product *= i;
        }
        return product;
    }
}
