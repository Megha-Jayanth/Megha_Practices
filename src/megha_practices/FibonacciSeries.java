package megha_practices;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scanner.nextInt();
		
		System.out.println("Fibonacci Series:");
		int num=0;
		int temp=1;
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(num+"");
			int sum=num+temp;
			num=temp;
			temp=sum;
		}

	}

}
