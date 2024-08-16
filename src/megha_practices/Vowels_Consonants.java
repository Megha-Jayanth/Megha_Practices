package megha_practices;

import java.util.Scanner;

public class Vowels_Consonants {

	public static void main(String[] args) {
		
		//String st ="hello world";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String st = scanner.nextLine();
		
		int j = 0, k = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e'
					|| st.charAt(i) == 'i' || st.charAt(i) == 'o'
					|| st.charAt(i) == 'u') {
				j++;
			} else
				k++;
		}
		System.out.println("No of vowels " + j);
		System.out.println("No of consonants " + k);



	}

}
