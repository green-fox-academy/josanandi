import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        //First version
        int[] aj = {3, 4, 5, 6, 7};
        int[] temporaryAj = new int[5];
        for (int i = 0 ; i < aj.length ; i++) {
            int j = aj.length-1;
            temporaryAj[i] = aj[j-i];
        }
        aj = temporaryAj;
        System.out.println(Arrays.toString(aj));

        //Second version
        for (int i = 0; i <aj.length/2 ; i++) {
            int tempValue=0;
            int j = aj.length-1;
            tempValue = aj[i];
            aj[i] = aj[j-i];
            aj[j-i] = tempValue;
        }

        System.out.println(Arrays.toString(aj));

    }
}
