package module3;

import java.util.Scanner;

public class CompanyNameChange {

	public static void main(String[] args) {

		String companyName;
		String s1;
		String s2;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		companyName = scan.nextLine();
		System.out.println("Enter the company name");
		s1 = scan.nextLine();
		System.out.println("Enter the new company name");
		s2 = scan.nextLine();
		String replaceString = companyName.replace(s1, s2);
		System.out.println(replaceString);
	}

}
