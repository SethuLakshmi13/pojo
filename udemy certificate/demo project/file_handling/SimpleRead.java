
package file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleRead {

	public static void main(String[] args) throws IOException {
		int ch;
		String fileName;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name");
		fileName = scan.nextLine();
		// scan.close();
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);

		} catch (FileNotFoundException fe) {
			System.out.println("file not found");
		}
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		fr.close();

	}
}
