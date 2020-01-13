package module1.module_oops;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Account number");
		String accountNumber =scan.next();
		System.out.println("Enter Account balance");
		int accountBalance=scan.nextInt();
		int balance;
		Account obj=new Account(accountNumber,accountBalance);
		System.out.println("Enter option 1 for deposit,2 for withdrawal");
		obj.setAccountNumber(accountNumber);
		int option=scan.nextInt();
		System.out.println("Enter Amount ");
		int amount=scan.nextInt();
		balance=obj.getBalance();
		if(option==1) {
			balance=balance+amount;
			System.out.println("your amount after transcation is "+balance);
		}
		else if(option==2){
			if(amount>balance) {
				System.out.println("Insufficient balance");
			}
			else {
				balance=balance-amount;
				System.out.println("Your amount after transcation is "+balance);
			}
		}
		
	}

}

