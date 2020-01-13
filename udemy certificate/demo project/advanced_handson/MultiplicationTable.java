package advanced_handson;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		int i=0;
		for(i=1;i<=10;i++) {
			int res=number*i;
			System.out.println(" "+number+"*"+i+"= "+res);
			}
		scanner.close();
		}
}
