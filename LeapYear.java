/*
print true if n is a leap year.
*/

public class LeapYear {
	public static void main(String[] args) {
		int year = Integer.parseInt("2015");
		boolean isLeapYear;
		
		//被4整除
		isLeapYear = (year % 4 ==  0);

		//被4整除 但是不能被100整除
		isLeapYear = isLeapYear && (year % 100 != 0);

		// 被4整除但不被100整除， 但除非被400整除
		isLeapYear = isLeapYear || (year % 400 == 0);

		System.out.println(isLeapYear);
	}
}