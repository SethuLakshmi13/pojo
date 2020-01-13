package advanced_handson;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int limit = scanner.nextInt();
		int []arr=new int[limit];
		int i,max=0;
		System.out.println("enter array values");
		for(i=0;i<limit;i++) {
			arr[i]=scanner.nextInt();
		}
		max=arr[0];
		for(i=1;i<limit;i++) {
			
			if(max<arr[i])
				max=arr[i];
		}
		System.out.print(max);
		scanner.close();
	}

}
