package megha_practices;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Elements");
		int number=scanner.nextInt();
		
		
		
	}

	public int[] solution(int[] nums,int target) {
		int n=nums.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[i]+nums[j]==target) {
					
					return new int[]{i,j};
										
				}
			}
		}
		return new int[]{};
		
	}
	
}
