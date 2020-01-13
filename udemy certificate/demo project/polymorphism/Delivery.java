package polymorphism;

public class Delivery {

	void displayDeliveryDetails(String bowlerName, String batsmanName) {

		String[] lastName = bowlerName.split(" ");
		System.out.println(lastName[1]);
		String[] lastNameBat = batsmanName.split(" ");
		System.out.println(lastNameBat[1]);

	}

	void displayDeliveryDetails(long runs) {
		if (runs == 4) {
			System.out.println("It is a Boundary");
		} else if (runs == 6) {
			System.out.println("It is Sixer");
		} else {
			System.out.println(runs);
		}

	}

}
