package collection_excersise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {

		int count;
		int i;
		int total = 0;
		double average;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of matches");
		count = scan.nextInt();
		int[] matchRun = new int[count];
		List<Integer> alist = new ArrayList<Integer>();
		for (i = 0; i < count; i++) {
			matchRun[i] = scan.nextInt();
			alist.add(matchRun[i]);
		}
		for (Integer num : alist) {
			total = num + total;
		}
		average = (double) ((total) / (count));
		System.out.println(total);
		System.out.printf("%.2f", average);

	}
}
