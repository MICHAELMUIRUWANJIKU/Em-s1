package papers;
import java.util.Scanner;
public class Supermarket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter kilos purchased");
		double kilos = scanner.nextDouble();
		
		double totalcost;
		
		totalcost = (kilos * 160);
		
		
		System.out.println ("enter amount paid");
		double cashpaid = scanner.nextDouble();
		
		
		if(cashpaid>totalcost) {
			double change = cashpaid - totalcost;
			System.out.println("change is equal to KSHS." +change);
		}
		else {
			double deficit = totalcost - cashpaid;
			System.out.println("i need KSHS. "+deficit);
		}
	}
}
