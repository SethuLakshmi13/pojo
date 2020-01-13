package inter_face;

import java.util.Scanner;

public class ProductMainToString {
	public static void main(String[] args) {

		long id;
		String productName;
		String supplierName;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id");
		id = scan.nextLong();
		System.out.println("Enter product name");
		productName = scan.next();
		System.out.println("Enter supplier name");
		supplierName = scan.next();
		ProductToString p = new ProductToString(id, productName, supplierName);
		System.out.println(p);
		System.out.println(p.getClass());
	}

}
