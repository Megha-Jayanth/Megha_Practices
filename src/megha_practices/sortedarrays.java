package megha_practices;

import java.util.Arrays;

public class sortedarrays {

	public static void main(String[] args) {
		// number sorting without duplicates
		int[] num= {1,1,2,3,4,5};
		int j=1;
		for(int i=1;i<num.length;i++) {
			if(num[i]!=num[i-1]) {
				num[j]=num[i];
				j++;
			}
		}
		System.out.println("number sorting without duplicates");
		for(int i=0;i<j;i++) {
			System.out.println(num[i]);
		}
		
		
		
		// string sorting without duplicates
		String[] strings= {"apple","mango","banana","apple"};
		Arrays.sort(strings);
		int k=0;
		for(int i=0;i<strings.length;i++) {
			if(i==0||!strings[i].equals(strings[i-1])) {
				strings[k]=strings[i];
				k++;
			}
		}
		System.out.println("string sorting without duplicates");
		for(int i=0;i<k;i++) {
			System.out.println(strings[i]);
		}

	}

}
