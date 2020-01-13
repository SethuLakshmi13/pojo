package advanced_handson;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the salary");
		long salary = scanner.nextLong();
		long amt=0;
		long out=0;
		if(salary<250000) {
			
			System.out.println("nil");
		}
		if(salary>250000) {
			amt=salary-250000;
			out=(long) (amt*(0.05));
			System.out.println(out);
			/*
			 * if(amt<500000) {
			 * 
			 * out=(long) (amt*(0.2)); System.out.println(out); }
			 */
		}
		if(amt>500000 ) {
			amt=amt-500000;
			out=(long) (amt*(0.2));
			System.out.println(out +"first");
			/*
			 * if(amt<10000) { out=(long) (amt*(0.2)); }
			 */
		}
		if(amt >1000000) {
			out=(long) (amt*(0.3));
			System.out.println(out +"second");
		}
		System.out.println(out +"final");
		scanner.close();
	}

}
