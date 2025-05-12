package papers;
import java.util.Scanner;
public class GptBanktoo {

	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter principle");
		int principle = scanner.nextInt();
		
		//System.out.println("enter balance");
		//int balance = scanner.nextInt();
		
		System.out.println("enter withdraw ammount");
		int withdraw = scanner.nextInt();
		
		if(withdraw>principle) {
			System.out.println("withdraw denied");
		}
		else {
			int newbalance = principle - withdraw;
			System.out.println("withdraw successful"+newbalance);}
			
		 	if (newbalance < 300) {
			 System.out.println("balance below 300");
			}
	}
}