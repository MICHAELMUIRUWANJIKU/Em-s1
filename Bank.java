		package papers;
		import java.util.Scanner;
		public class Bank {

			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("enter principle");
				double principle = scanner.nextDouble();
				
				System.out.println("enter amount to withdraw");
				double withdraw = scanner.nextDouble();
				
				double balance = (principle - withdraw);
				System.out.println("New Balance is = "+balance);
				
				double newbalance = balance + 0 ;
			
				if (newbalance<=0); {  
				System.out.println("can't withdraw");		
				}
				
				if(balance<300){
						System.out.println("balance is below Kshs. 300");
					}
				}
				// TODO Auto-generated method stub
		}