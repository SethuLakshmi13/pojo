package module2;

import java.util.Scanner;

public class ProfitPercentage {

	public static void main(String[] args) {
		
		double a, b, y1;
		double profitPercent;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of dozens");
		int x = scan.nextInt();
		System.out.println("Cost price for one dozen");
		int y = scan.nextInt();
		System.out.println("Enter Selling Price");
		int z = scan.nextInt();
		y1 = (double) y;
		a = y1 / 12.00;
		if (a > z) {
			b = a - z;
		} else {
			b = z - a;
		}
		profitPercent = (b / a) * (100.00);
		System.out.printf("%.2f", profitPercent);

	}

}
