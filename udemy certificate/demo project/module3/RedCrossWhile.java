package module3;

import java.util.Scanner;

public class RedCrossWhile {

	public static void main(String[] args) {

		int i = 0;
		int total = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		while (i < n) {
			a[i] = scan.nextInt();
			total = total + a[i];
			i++;
		}
		
		System.out.println(total);
	}

}
