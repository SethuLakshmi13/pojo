package module4;

import java.util.Scanner;

public class ProductConstructorMain {

	public static void main(String[] args) {

		long id;
		String productName;
		String supplierName;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Product Id: ");
		id = scan.nextLong();
		System.out.println("Enter Product Name: ");
		productName = scan.next();
		System.out.println("Enter Supplier Name: ");
		supplierName = scan.next();
		Product r1 = new Product(id, productName, supplierName);
		Product obj = new Product(id, productName, supplierName);
		obj.setid(id);
		obj.setproductName(productName);
		obj.setsupplierName(supplierName);
		long a = obj.getid();
		String b = obj.getproductName();
		String c = obj.getsupplierName();
		display(a, b, c);
	}

	static void display(long a, String b, String c) {

		System.out.println("product id is " + a);
		System.out.println("product name is " + b);
		System.out.println("supplier name is " + c);

	}

}
