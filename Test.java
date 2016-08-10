public class Test {
	public static void main(String[] args) {
		String str = "first";
		String rem1 = str.substring(1);
		String rem2 = str.substring(0, 0);
		String prefix = "" + str.charAt(0);

		String rem3 = str.substring(0, 0) + str.substring(1);

		System.out.println("rem1 = " + rem1);
		System.out.println("rem2 = " + rem2);
		System.out.println("prefix = " + prefix);
		System.out.println("rem3 = " + rem3);
	}

	static void per(String str) {
		per(str, "");
	}

	static void per(String str, String prefix) {
		if (str.length() == 0) {
			system.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				prefix = str.charAt(i);
				per(rem, prefix);
			}
		}
	}
}