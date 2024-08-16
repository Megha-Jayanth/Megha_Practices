package megha_practices;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String str="This is test string. this test string used to find duplicates";
		
		findDuplicates(str);

	}

	private static void findDuplicates(String str) {
		
		String[] words = str.toLowerCase().split("\\s+");
        int[] counts = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]", "");
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    counts[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (counts[i] > 0) {
                System.out.println(words[i] + ": " + (counts[i] + 1));
            }

   }
	}
}