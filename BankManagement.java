package papers;
import java.util.Scanner;
public class BankManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int principle, balance, withdraw, deposit, account_empty, loan, newbalance;
		
		 System.out.println("enetr principle");
		 principle = scanner.nextInt();
				 
		 loan = 10000;
		 
		 
		 System.out.println("enter amount to withdraw");
		 withdraw = scanner.nextInt();
		 balance = principle - withdraw;
		 System.out.println("Account balance is ="+balance);
		
		System.out.println("enter amount to deposit");
		deposit = scanner.nextInt();
		newbalance =  balance + deposit;
		System.out.println("new account balance is = KSHS."+balance);
		
		if(newbalance<=10000);{
			System.out.println("account empty"+balance);
		}
	}}