package collection_excersise1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SortScores {

	public static void main(String[] args) {

		int count;
		int i;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of matches");
		count = scan.nextInt();
		int[] matchRun = new int[count];
		List<Integer> alist = new ArrayList<Integer>();
		for (i = 0; i < count; i++) {
			matchRun[i] = scan.nextInt();
			alist.add(matchRun[i]);
		}
		Collections.sort(alist);
		for (int a : alist) {
			System.out.println(a);

		}

	}

}
