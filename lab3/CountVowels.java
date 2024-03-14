package lab3;
import java.util.Scanner;

public class CountVowels {
	public static int NumofVowels(String str) {
		int vowels_count = 0;
		String vowels = "aeiouAEIOU";
		
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (str.charAt(i) == vowels.charAt(j)) {
					vowels_count += 1;
				}				
			}
		}	
		return vowels_count;
	}
		
	public static void main(String[] args) {
		System.out.print("Enter a string: ");		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println("#vowels = " + NumofVowels(s));	
		input.close();
     }	
}
