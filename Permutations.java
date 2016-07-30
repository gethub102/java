public class Permutations {

	static void permutation(String str) {
		permutation(str, "", 0);
	}

	static void permutation(String str, String prefix, int count) {
		if (str.length() == 0) {
			count++;
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);					
				permutation(rem, prefix + str.charAt(i), count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		int count = 0;
		permutation(str, "-", count);
		System.out.println("count == " + count);
	}
}