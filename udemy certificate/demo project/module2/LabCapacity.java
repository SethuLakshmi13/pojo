package module2;

import java.util.Scanner;

public class LabCapacity {

	public static void main(String[] args) {
		int x;
		int y;
		int z;

		Scanner scan = new Scanner(System.in);
		System.out.println("L1  capacity");
		x = scan.nextInt();
		System.out.println("L2 capacity");
		y = scan.nextInt();
		System.out.println("L3 capacity");
		z = scan.nextInt();

		if ((x < y) && (x < z)) {
			System.out.println("L1 has minimal capacity");
		} else if ((y < x) && (y < z)) {
			System.out.println("L2 has minimal capacity");
		} else {
			System.out.println("L3 has minimal capacity");
		}
	}
}