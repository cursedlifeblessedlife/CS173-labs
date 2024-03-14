package lab7;
import java.util.Arrays;
import java.util.Random;

public class MinMax {

    public static void findminmax(int[] data) {
        int count_comparison = 0;
        int n = data.length;
        int min, max;

        // Compare two elements in a pair, data[0] and data[1], data[2] and data[3], etc. Swap if out of order
        for (int i = 0; i < n - 1; i += 2) {
            count_comparison++;
            if (data[i] > data[i + 1]) {
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }

        min = data[0];
        max = data[1];

        // Find min in data[0], data[2], ...
        for (int i = 2; i < n; i += 2) {
            count_comparison++;
            if (data[i] < min) {
                min = data[i];
            }
        }

        // Find max in data[1], data[3], ...
        for (int i = 3; i < n; i += 2) {
            count_comparison++;
            if (data[i] > max) {
                max = data[i];
            }
        }

        // Handle the case when the size is odd
        if (n % 2 != 0) {
            count_comparison++;
            if (data[n - 1] < min) {
                min = data[n - 1];
            } else if (data[n - 1] > max) {
                max = data[n - 1];
            }
        }

        // Output
        System.out.println("n = " + data.length);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("I need " + count_comparison + " comparisons.");
    }

    public static void main(String[] args) {
        int n = 12;
        int[] data = new int[n];
        Random r = new Random();
        for (int i = 0; i < data.length; ++i) {
            data[i] = r.nextInt(50);
        }
        data[data.length - 1] = -1000;
        System.out.println(Arrays.toString(data));

        findminmax(data);
    }
}
