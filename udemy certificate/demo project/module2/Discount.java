package module2;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		double a;
		double totalAmt, discountedAmt, savedAmt;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the price of the First product");
		double priceOne = scan.nextDouble();
		System.out.println("Enter the price of the Second product");
		double priceTwo = scan.nextDouble();
		System.out.println("Enter the discounted amount");
		int discountAmt = scan.nextInt();
		totalAmt = priceOne + priceTwo;
		a = (double) (discountAmt / 100.00);
		discountedAmt = (totalAmt) * (a);
		savedAmt = totalAmt - discountedAmt;
		System.out.printf("Total Amount is : %.2f\n ", totalAmt);
		System.out.printf("Saved Amount is : %.2f \n", savedAmt);
		System.out.printf("Discounted Amount is : %.2f\n ", discountedAmt);
	}

}
