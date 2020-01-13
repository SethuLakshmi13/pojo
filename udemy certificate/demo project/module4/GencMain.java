package module4;

import java.util.Scanner;

public class GencMain {

	public static void main(String[] args) {
		int i;
		int s;
		long employeeId;
		String name;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of Employees");
		s = scan.nextInt();
		GencMain D = new GencMain();
		long[] a = new long[s];
		String[] b = new String[s];
		String[] c = new String[s];

		for (i = 0; i < s; i++) {
			System.out.println("Enter the Id");
			employeeId = scan.nextLong();
			System.out.println("Enter the Name of the Employee");
			name = scan.next();
			Student obj = new Student(employeeId, name);
			obj.setid(employeeId);
			obj.setname(name);
			a[i] = obj.getid();
			b[i] = obj.getname();
			c[i] = obj.getcourseName();
		}

		for (i = 0; i < s; i++) {
			D.display(a[i], b[i], c[i]);

		}

	}

	public static void display(long a, String b, String c) {

		System.out.println("user id is " + a);
		System.out.println("user name is " + b);
		System.out.println("course name is" + c);

	}

}
