package module2;

import java.util.Scanner;

public class CompareInt {

	public static void main(String[] args) {

		int x, y;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter x value");
		x = scan.nextInt();
		System.out.println("enter y value");
		y = scan.nextInt();
		if (x < y) {
			System.out.println(x + " is less than " + y);
		} else if (x > y) {
			System.out.println(x + " is greater than " + y);
		} else {
			System.out.println(x + " is equal to " + y);
		}

	}

}
