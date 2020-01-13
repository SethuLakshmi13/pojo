package advanced_handson;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		int i, j;
		for (i = 1; i <= number; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();

	}

}
