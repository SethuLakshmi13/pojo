package map_exsersise;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Box {

	public static void main(String[] args) {
		int count;
		int i;
		double length;
		double width;
		double height;
		double volume;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of boxes: ");
		count = scan.nextInt();
		Set<BoxConstructor> h = new HashSet<BoxConstructor>();
		for (i = 0; i < count; i++) {
			System.out.println("Enter the length");
			length = scan.nextInt();
			System.out.println("Enter the width");
			width = scan.nextInt();
			System.out.println("Enter the height");
			height= scan.nextInt();
			BoxConstructor bc = new BoxConstructor(length, width,height);
			h.add(bc);
		}
		scan.close();
		Iterator<BoxConstructor> itr=h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
