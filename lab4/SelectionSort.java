package lab4;

import java.util.Arrays;
public class SelectionSort {
    public static void selectionsort(double[ ] data) {
        for (int i = 0; i < data.length; i++) {

        }
    }
    public static void main(String[] args) {
        double[] a = { 8.3, -6.4, 9.1, 5.0, 3.2, -10.3, -1.5, 4.0, 2.1, -1.4 };
        System.out.println(Arrays.toString(a));

        selectionsort(a);
        System.out.println(Arrays.toString(a));
    }
}
