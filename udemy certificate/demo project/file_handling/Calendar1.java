package file_handling;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
public class Calendar1 {

	public static void main(String[] args) throws ParseException {
		String date;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		date=scan.nextLine();
		displayDate(date);
		
}
	public static void displayDate(String date) throws ParseException {
		 Calendar calendar = Calendar.getInstance();
		 SimpleDateFormat DateFormat1=new SimpleDateFormat("yyyy-MM-dd");
		 Date date1=DateFormat1.parse(date);
		 calendar.setTime(date1);
		 calendar.add(Calendar.MONTH,-20);
		 System.out.println("20 months before"+ date+ "will be "+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE));
	}
	
}
