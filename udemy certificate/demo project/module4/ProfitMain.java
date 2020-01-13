package module4;

import java.util.Scanner;

public class ProfitMain {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double profitPercent;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of dozens");
		x = scan.nextInt();
		System.out.println("Cost price for one dozen");
		y = scan.nextInt();
		System.out.println("Enter Selling Price");
		z = scan.nextInt();
		profitPercent = calculateProfit(x, y, z);
		System.out.printf("Profit Percent is : %.2f", profitPercent);

	}

	public static double calculateProfit(double x, double y, double z) {
		double a, b, d;
		double profitPercent;

		a = y / 12.00;
		if (a > z) {
			b = a - z;
		} else {
			b = z - a;
		}
		profitPercent = (b / a) * (100.00);
		return profitPercent;

	}

}
