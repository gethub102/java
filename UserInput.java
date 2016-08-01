import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		String name;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = user_input.next();
		System.out.println("Your name is: " + name);
	}
}