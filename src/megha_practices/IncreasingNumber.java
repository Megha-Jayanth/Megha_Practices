package megha_practices;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a Number");
    int number=scanner.nextInt();
    
    boolean result=isIncreasingNumber(number);
    
    System.out.println(result);
    
	}

	private static boolean isIncreasingNumber(int number) {
		
		String str=String.valueOf(number);
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>=str.charAt(i+1))
			{
				return false;
			}
		}
		
		return true;
	}

}
