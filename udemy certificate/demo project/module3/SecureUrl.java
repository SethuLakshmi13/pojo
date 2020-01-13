package module3;

import java.util.Scanner;

public class SecureUrl {

	public static void main(String[] args) {

		int i, flag;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url");
		String url = scan.nextLine();
		System.out.println("Enter first word");
		String firstWord = scan.nextLine();

		if (firstWord.equals(url.substring(0, 5))) {
			System.out.println('"' + url + '"' + "starts with " + '"' + firstWord + '"');
		} else {
			System.out.println('"' + url + '"' + " does not statrts with " + '"' + firstWord + '"');
		}
	}

}
