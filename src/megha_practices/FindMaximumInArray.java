package megha_practices;

import java.util.Arrays;

public class FindMaximumInArray {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,5,10};
		
		int maxProduct=findMaxProduct(num);
		System.out.println(maxProduct);

	}

	private static int findMaxProduct(int[] num) {
		Arrays.sort(num);
		
		int product1 = num[num.length - 1] * num[num.length - 2] * num[num.length - 3];
         int product2 = num[0] * num[1] * num[num.length - 1];

        return Math.max(product1, product2);
	}

}
