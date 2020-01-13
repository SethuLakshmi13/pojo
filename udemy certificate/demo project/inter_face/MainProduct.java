package inter_face;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {

		long[] id = new long[2];
		String[] productName = new String[2];
		String[] supplierName = new String[2];
		int i;
		boolean compareStatus;
		boolean check = true;

		Scanner scan = new Scanner(System.in);

		for (i = 0; i < 2; i++) {
			System.out.println("Enter id");
			id[i] = scan.nextLong();
			System.out.println("Enter product name");
			productName[i] = scan.next();
			System.out.println("Enter supplier name");
			supplierName[i] = scan.next();
		}

		Product p = new Product(id[0], productName[0], supplierName[0]);
		p.setId(id[0]);
		p.setProductName(productName[0]);
		p.setSupplierName(supplierName[0]);
		Product p1 = new Product(id[1], productName[1], supplierName[1]);
		p1.setId(id[1]);
		p1.setProductName(productName[1]);
		p1.setSupplierName(supplierName[1]);
		compareStatus = p.equals(p1);
		if (compareStatus == check) {
			System.out.println("Both Products are same");
		} else {
			System.out.println("Both Products are different");
		}

	}
}
