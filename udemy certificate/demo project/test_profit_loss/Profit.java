package test_profit_loss;

import java.util.Scanner;

public class Profit{

	public static void main(String[] args) {
		
		double a, b, y1;
		double profitPercent;
		double status;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of dozens");
		int x = scan.nextInt();
		System.out.println("Cost price for one dozen");
		int y = scan.nextInt();
		System.out.println("Enter Selling Price");
		double z = scan.nextInt();
		y1 = (double) y;
		a = y1 / 12.00;
		status=profitLoss(a,z);
		if (a > z) {
			b = a - z;
		} else {
			b = z - a;
		}
		profitPercent = (b / a) * (100.00);
		System.out.printf("%.2f", profitPercent);

	}
	public static double profitLoss(double costPrice,double sellingPrice) {
		if(costPrice<0||sellingPrice<0||(sellingPrice==0 && costPrice==0)) {
			throw new IllegalArgumentException();
		}
		else {
		return sellingPrice-costPrice;
		}
	}

}
