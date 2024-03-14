package lab2;

public class DisctinctElements {
    public static void main(String[ ] args) {
        double[] a = {8.3, -6.4, 9.1, 5.0, 3.2, -10.3, -1.5, 4.0, 2.1, -1.4};
        boolean isDistinct = true;
        double duplicate = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate = a[i];
                    isDistinct = false;
                    break;
                }
            }
        }

        if (isDistinct) {
            System.out.println("The array is distinct!");
        } else {
            System.out.println("The array is NOT distinct! The duplicate value is " + duplicate);
        }
    }
}

