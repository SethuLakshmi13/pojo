package polymorphism;

import java.util.Scanner;

public class CricketMain {

	public static void main(String[] args) {
		int choice;
		String bowlerName;
		String batsmanName;

		Scanner scan = new Scanner(System.in);
		System.out.println("Menu\n 1.player details of the delivery\n 2.Run details of the delivery");
		choice = scan.nextInt();
		scan.nextLine();
		if (choice == 1) {
			System.out.println("Enter bowler name");
			bowlerName = scan.nextLine();
			System.out.println("Enter batsman  name");
			batsmanName = scan.nextLine();
			Delivery d = new Delivery();
			d.displayDeliveryDetails(bowlerName, batsmanName);
		} else {
			long runs = scan.nextInt();
			Delivery d = new Delivery();
			d.displayDeliveryDetails(runs);
		}

	}

}
