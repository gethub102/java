/*
O(n^2)
*/

public class Fib {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("num = " + num);
		int ret = fib(num);
		System.out.println();
		System.out.println("ret = " + ret);
	}

	static int fib(int n) {
		if (n <= 0) return 0;
		else if (n == 1) { System.out.println("get = 1");return 1;}
		System.out.print((n - 1) + " + " + (n - 2) + " + ");
		return fib(n - 1) + fib(n - 2);
	}
}