import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class Input {
	public static void main(String[] args) {
		Console c = System.console();
		if (c == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		String login = c.readLine("Enter your login: ");
		int count = 0;
		while(count < 10){
			for (int i = 0; i < count; i++) {
				System.out.print(".");
			}
			System.out.println();
			count++;
		}
		System.out.println("login is: " + login);
	}
}