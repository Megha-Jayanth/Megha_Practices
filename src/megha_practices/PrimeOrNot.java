package megha_practices;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		//isPrime();
		
		if(isPrime(num)) {
			System.out.println(num +"is a prime number");
		}else {
			System.out.println(num +"not a prime number");
		}
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;++i) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
		
	}

}
