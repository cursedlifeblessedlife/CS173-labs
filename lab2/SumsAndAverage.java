package lab2;

public class SumsAndAverage {
    public static void main(String[ ] args) {
        double[] a = {8.3, -6.4, 9.1, 5.0, 3.2, -10.3, -1.5, 4.0, 2.1, -1.4};

        double sum_positive = 0;
        double sum_negative = 0;
        double average = 0;

        for (double i : a) {
            if (i > 0) {
                sum_positive += i;
            }

            if (i < 0) {
                sum_negative += i;
            }

            average += i;
        }

        average /= a.length;

        System.out.println("Positive sum = " + sum_positive);
        System.out.println("Negative sum = " + sum_negative);
        System.out.println("Average = " + average);
    }
}

