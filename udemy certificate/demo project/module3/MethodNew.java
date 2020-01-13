package module3;

import java.util.Scanner;

public class MethodNew {

	public static void main(String[] args) {
		
		int number;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		number = scan.nextInt();
		String[] day = new String[] { "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat" };
		System.out.println("Day of the week is " + day[number - 1]);

	}

}
