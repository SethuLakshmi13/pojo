package exce_ption;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {

		int age;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scan.nextInt();
		try {
			if (age < 19) {
				throw new InvalidAgeException("notvalid");
			} else {
				System.out.println("Welcome to vote");
			}
		} catch (InvalidAgeException invalid) {
			System.out.println("Exception occured: InvalidAgeException:" + invalid.getMessage());
		}

	}

}
