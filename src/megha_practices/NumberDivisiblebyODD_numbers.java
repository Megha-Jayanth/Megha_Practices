package megha_practices;

import java.util.Scanner;

public class NumberDivisiblebyODD_numbers {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		//int n=10;
		
		for(int i=1;i<n;i++)
		{
			if(i%3==0||i%5==0) {
				System.out.println(i);
			}
		}
		
		
	}
	

}
