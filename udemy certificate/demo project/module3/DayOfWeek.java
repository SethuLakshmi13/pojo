package module3;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		number = scan.nextInt();
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat" };
		System.out.println(day[number - 1]);

	}

}
