import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		StringBuffer content = null;
		FileInputStream fileStream = null;
		int ch;
		try {
			fileStream = new FileInputStream("C:\\Users\\800341\\eclipse-workspace\\DemoProject\\src\\Dog.java");
			content = new StringBuffer();
			while ((ch = fileStream.read()) != -1) {
				content.append((char) ch);
			}

		} catch (FileNotFoundException fileNotFound) {
			fileNotFound.printStackTrace();
		} catch (IOException ioexp) {
			ioexp.printStackTrace();
		} finally {
			try {
				System.out.println(content);
				fileStream.close();

			} catch (IOException ioexp) {
				ioexp.printStackTrace();
			}
		}

	}
}