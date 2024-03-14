package lab1;

public class IntegerFibonacciSequence {
    public static void main(String[ ] args) {
        int a;
        int b = 0;
        int c = 1;
        while (c <= 10000) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}