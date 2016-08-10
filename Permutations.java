public class Permutations {

	static void permutation(String str) {
		permutation(str, "");
	}

	static void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				System.out.println("i = " + i);
				System.out.println("str = " + str);
				String rem = str.substring(0, i) + str.substring(i + 1);
				System.out.println("rem is == " + rem);
				System.out.println("prefix is == " + prefix + str.charAt(i));					
				permutation(rem, prefix + str.charAt(i));
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		permutation(str, "-");
	}
}

