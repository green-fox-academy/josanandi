public class Sum {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        int number = 5;

        System.out.println(sum(number));
    }

    private static int sum(int number) {
        int total = 0;

        for (int i = 0; i <=number ; i++) {
            total +=i;
        }
        return total;
    }
}

