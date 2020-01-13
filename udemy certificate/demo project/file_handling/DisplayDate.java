package file_handling;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class DisplayDate {

	public static void main(String[] args) throws ParseException {
		String date;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		date=scan.nextLine();
		displayDate(date);
		}
	public static void displayDate(String date) throws ParseException {
		String pattern="MMM dd,yyyy";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
		Date date1=simpleDateFormat.parse(date);
		SimpleDateFormat DateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String date2=DateFormat.format(date1);
		System.out.println("As a string type: ");
		System.out.println(date2);
		SimpleDateFormat DateFormat1=new SimpleDateFormat("yyyy-MM-dd");
		Date date3=DateFormat1.parse(date2);
		System.out.println("As a Date type:");
		System.out.println(date3);
	}

}
