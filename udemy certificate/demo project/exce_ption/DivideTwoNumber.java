package exce_ption;

import java.util.Scanner;

public class DivideTwoNumber {

	public static void main(String[] args) {

		int a;
		int b;
		int res;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		a = scan.nextInt();
		System.out.println("Enter second number");
		b = scan.nextInt();
		try {
			res = a / b;
			System.out.println("The quotient of " + a + "/" + b + ": " + res);
		} catch (ArithmeticException e) {
			System.out.println("DivisionBYZero Exception caught");
		} finally {
			System.out.println("Inside finally block");
		}

	}

}
