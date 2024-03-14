package lab8;

public class Palindrome {
    public static boolean isPalindrome(String s, int low, int high) {
        if (low >= high) {
            return true;
        } else if (s.charAt(low) != s.charAt(high)) {
            return false;
        } else {
            return isPalindrome(s, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        String str = "gohangasalamiimalasagnahog";
        boolean flag = isPalindrome(str, 0, str.length() - 1);
        System.out.println(str);
        System.out.println("The string is a palindrome: " + flag);

        str = "madam";
        flag = isPalindrome(str, 0, str.length() - 1);
        System.out.println(str);
        System.out.println("The string is a palindrome: " + flag);
    }
}
