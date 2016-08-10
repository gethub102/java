/*
memozation for O(n) time complexity
*/

public class AllFib {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int[] memo = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			System.out.println(i + ": " + fib(i, memo));
		}
	}

	static int fib(int n, int[] memo) {
		if (n <= 0) return 0;
		else if (n == 1) return 1;
		else if (memo[n] > 0) return memo[n];
		memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
		return memo[n];
	}
}