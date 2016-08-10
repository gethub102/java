/*
O(log n)
*/

public class PowerOf2 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int ret = powerOf2(n);
		System.out.println();
		System.out.println(ret);
	} 

	static int powerOf2 (int n) {
		if (n == 1) {
			System.out.println(1);
			return 1; 
		} else {
			int prev = powerOf2(n / 2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
}