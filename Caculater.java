import java.util.Scanner;

public class Caculater {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		while(true) {
			int a = 0;
			int b = 0;
			int c = 0;
			String opt; //operator

			System.out.println("输入第一个数值：");
			a = Integer.parseInt(user_input.next());
			
			System.out.println("输入运算符：");
			opt = user_input.next();

			if (opt.equals("quit")) {
				System.out.println("退出计算器");
				break;
			}
			
			System.out.println("输入第二个数值：");
			b = Integer.parseInt(user_input.next());
			
			switch(opt){
				case "+": c = a + b;
						System.out.println(a + " " + opt + " "  +  b + " = " + c);
						break;
				case "-": c = a - b;
						System.out.println(a + " " + opt + " "  +  b + " = " + c);
						break;
				case "*": c = a * b;
						System.out.println(a + " " + opt + " "  +  b + " = " + c);
						break;
				case "/": c = a / b;
						System.out.println(a + " " + opt + " "  +  b + " = " + c);
						break;
				case "%": c = a % b;
						System.out.println(a + " " + opt + " "  +  b + " = " + c);
						break;
				default:
					System.out.println("应该输出正确的操作符，如: + - * / %");
					break;
			}
		}	
	}
}