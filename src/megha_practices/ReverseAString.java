package megha_practices;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.next();
		
		String reversed=reverseString(input);
		System.out.println(reversed);

	}

	private static String reverseString(String input) {
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed+=input.charAt(i);
		}
		
		return reversed;
	}

}
