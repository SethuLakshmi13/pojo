package advanced_handson;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the limit of the array");
		int limit = scanner.nextInt();
		int []arr=new int[limit];
		int i,temp=0;
		System.out.println("enter array values");
		for(i=0;i<limit;i++) {
			arr[i]=scanner.nextInt();
		}
		for(i=1;i<limit-1;i++) {
			if(arr[i-1]>arr[i]) {
				temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(arr[0]);
		scanner.close();	

	}

}
