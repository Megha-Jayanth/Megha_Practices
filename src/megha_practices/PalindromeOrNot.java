package megha_practices;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=scanner.nextInt();
		
		boolean result=isPalindromeOrNot(number);
		System.out.println(result);

	}

	private static boolean isPalindromeOrNot(int number) {
		
		int original=number;
		
		int reversed=0;
		
		while(number!=0) {
			int reminder=number%10;
			reversed=reversed*10+reminder;
			number/=10;
		}
		
		
		return original==reversed;
	}

}
