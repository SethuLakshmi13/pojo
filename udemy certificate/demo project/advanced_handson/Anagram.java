package advanced_handson;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		boolean status = false;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char arr1[] = str1.toLowerCase().toCharArray();
			char arr2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status =Arrays.equals(arr1, arr2);
			}
		if (status == true) {
			System.out.println("It is anagram");
		} else {
			System.out.println("It is  not a anagram");
		}
		scanner.close();
	}
}
