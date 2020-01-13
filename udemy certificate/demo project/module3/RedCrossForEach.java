package module3;

import java.util.Scanner;

public class RedCrossForEach {

	public static void main(String[] args) {
		
		int total = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i : a) {
			a[i] = scan.nextInt();
			total = total + a[i];
		}
		
		System.out.println(total);
	}

}
