package file_handling;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class SimpleFileWrite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String teamName;
		int runs;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(
					"C:\\Users\\800341\\eclipse-workspace\\DemoProject\\src\\file_handling\\player.csv");
			System.out.println("Enter the Player Name");
			name = scan.next();
			System.out.println("Enter the Team Name");
			teamName = scan.next();
			System.out.println("Enter the score");
			runs = scan.nextInt();
			String fileContent = name + "," + teamName + "," + runs;
			fileWriter.write(fileContent);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
