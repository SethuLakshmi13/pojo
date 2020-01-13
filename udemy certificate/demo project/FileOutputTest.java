import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {
	public static void main(String[] args) {
		Scanner scanner=null;
		FileOutputStream fileOutput=null;
		scanner=new Scanner(System.in);
		System.out .println("Enter Name");
		String name= scanner.next();
		try {
			fileOutput=new FileOutputStream("C:\\Users\\800341\\eclipse-workspace\\DemoProject\\src\\Dog.java");
			byte buffer[]=new byte[100];
			buffer=name.getBytes();
			fileOutput.write(buffer);
			System.out.println("Employee Details Succesfully"+"written to the file");
		}catch (FileNotFoundException fileOut) {
			fileOut.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				fileOutput.close();
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
		}
		
	}

}
