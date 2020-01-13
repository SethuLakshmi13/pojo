package polymorphism;

import java.util.Scanner;

public class CardMain {

	public static void main(String[] args) {
		int choice;
		String cardDetails;
		int pointsEarned;
		double totalAmount;
		int rating;

		Scanner scan = new Scanner(System.in);
		System.out.println("Select the card\n1.Payback Card\n2.Membership Card");
		choice = scan.nextInt();
		scan.nextLine();

		switch (choice) {
		case 1:
			System.out.println("enter Card Details");
			cardDetails = scan.nextLine();
			String[] arr = cardDetails.split("[|]");
			System.out.println("Enter points in the card");
			pointsEarned = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter amount");
			totalAmount = scan.nextDouble();
			PaybackCard p = new PaybackCard(arr[0], arr[1], arr[2], pointsEarned, totalAmount);
			System.out.println(arr[0] + " PayBack card Details:");
			System.out.println("Card Number " + p.cardNumber);
			System.out.println("Total Amount " + p.getTotalAmount());
			System.out.println("Points earned " + p.getPointsEarned());
			break;
		case 2:
			System.out.println("enter Card Details");
			cardDetails = scan.nextLine();
			String[] arr1 = cardDetails.split("[|]");
			System.out.println("Enter rating in the card");
			rating = scan.nextInt();
			scan.nextLine();
			MembershipCard m = new MembershipCard(arr1[0], arr1[1], arr1[2], rating);
			System.out.println(arr1[0] + " PayBack card Details:");
			System.out.println("Card Number " + m.cardNumber);
			System.out.println("Rating is " + m.getIntegerRating());
		
		}

	}

}
