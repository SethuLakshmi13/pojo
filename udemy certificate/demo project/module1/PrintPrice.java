package module1;

import java.util.Scanner;

public class PrintPrice {

	public static void main(String[] args) {
		double costPrice;
		double sellingPrice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Cost Price");
		costPrice = scan.nextFloat();
		System.out.println("Enter the Selling Price");
		sellingPrice = scan.nextFloat();
		System.out.println(costPrice);
		System.out.println(sellingPrice);

	}

}
