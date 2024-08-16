package megha_practices;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();
		
		boolean result=isPrimeOrNot(num);
		System.out.println(result);

	}

	private static boolean isPrimeOrNot(int num) {
		
		if(num<=1) {
			return false;
		}
		
		while(num%2==0) {
			num/=2;
		}
		return num==1;
		
		
	}

}
