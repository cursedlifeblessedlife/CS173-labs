package lab8;
import java.util.Arrays;
import java.util.Random;

public class Rearrange {

    /* Rearranges an array of integer values
     * so that all the even values appear before all the odd values. */
    public static void rearrangeEvenOdd(int[] data, int low, int high) {
        if (low < high) {
            if (data[high] % 2 == 0) {
                int temp = data[low];
                data[low] = data[high];
                data[high] = temp;
                rearrangeEvenOdd(data, low + 1, high);
            } else {
                rearrangeEvenOdd(data, low, high - 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int rng = n * 5;
        int[] A = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(rng);
        }
        System.out.println("A = " + Arrays.toString(A));
        rearrangeEvenOdd(A, 0, A.length - 1);
        System.out.println("A rearranged = ");
        System.out.println(Arrays.toString(A));
    }
}