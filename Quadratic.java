public class Quadratic {
	public static void main(String[] args) {
		String input1 = "12";
		String input2 = "7";
		double b = Double.parseDouble(input1);
		double c = Double.parseDouble(input2);

		double discriminant = b*b - 4.0*c;
		double sqroot = Math.sqrt(discriminant);
		
		double root1 = (-b + sqroot) / 2.0;
		double root2 = (-b - sqroot) / 2.0;

		System.out.println(root1);
		System.out.println(root2);
	}
}