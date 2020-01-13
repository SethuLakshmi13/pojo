package module4;

import java.util.Scanner;

public class GetterMain {

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
		GetterSetter obj = new GetterSetter();
		obj.setid(id);
		System.out.println("product id is " + obj.getid());
		obj.setproductName(productName);
		System.out.println("product name is " + obj.getproductName());
		obj.setsupplierName(supplierName);
		System.out.println("supplier name is " + obj.getsupplierName());

	}

}
