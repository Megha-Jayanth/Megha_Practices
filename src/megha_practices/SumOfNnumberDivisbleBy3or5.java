package megha_practices;

import java.util.Scanner;

public class SumOfNnumberDivisbleBy3or5 {
	
	public static void main(String[] args) {

		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter a Number:");
			int n=scanner.nextInt();
			
			int sum = 0;
			
			for(int i=1;i<=10;i++)
			{
				if(i % 3==0|| i % 5==0) {
					sum+=i;
				}
			}
			System.out.println(sum);
		}
		

	}
}
