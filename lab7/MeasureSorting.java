package lab7;
import java.util.Random;
import java.util.Arrays;

public class MeasureSorting {

    public static void mySort(int[ ] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }
    public static void javaSort(int[] a) {
        Arrays.sort(a);
    }

    public static void printUpTo20(int[] a) {
        int n = a.length;
        if (n > 20) n = 20;
        for (int i=0; i<n; ++i) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 100000; // The problem size

        // Build two identical arrays with random integers
        int[] A = new int[n];
        Random r = new Random();

        for (int i=0; i<A.length; ++i) {
            A[i] = r.nextInt(n * 20);
        }

        int[] B = new int[n];
        B = A.clone();

        System.out.print("A = ");
        printUpTo20(A);
        System.out.print("B = ");
        printUpTo20(B);

        // Measure and output the running time of mySort()
        long startTimeMySort = System.currentTimeMillis();
        mySort(A);
        long endTimeMySort = System.currentTimeMillis();
        System.out.println("Elapsed time for mySort(): " + (endTimeMySort - startTimeMySort) + " nanoseconds");

        // Verify the array is sorted correctly by checking the first 20 numbers
        System.out.print("Sorted A = ");
        printUpTo20(A);

        // Measure and output the running time of javaSort()
        long startTimeJavaSort = System.currentTimeMillis();
        javaSort(B);
        long endTimeJavaSort = System.currentTimeMillis();
        System.out.println("Elapsed time for javaSort(): " + (endTimeJavaSort - startTimeJavaSort) + " nanoseconds");

        // Verify the array is sorted correctly by checking the first 20 numbers
        System.out.print("Sorted B = ");
        printUpTo20(B);
    }
}
