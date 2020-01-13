package map_exsersise;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.Entry;

public class MaxScorer {

	public static void main(String[] args) {

		int count;
		int i;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of player: ");
		count = scan.nextInt();
		String[] name = new String[count];
		long[] run = new long[count];

		HashMap<String, Long> h = new HashMap<String, Long>();
		for (i = 0; i < count; i++) {
			int a = i + 1;
			System.out.println("Enter the details of Player" + a);
			name[i] = scan.next();
			run[i] = scan.nextInt();
			h.put(name[i], run[i]);

		}
		long maxvalue = Collections.max(h.values());
		for (Entry<String, Long> entry : h.entrySet()) {
			if (entry.getValue() == maxvalue) {
				System.out.println(entry.getKey());
			}
		}

	}

}
