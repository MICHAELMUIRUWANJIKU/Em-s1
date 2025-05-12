package papers;
import java.util.Scanner;
public class WELCOME {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("who are you");
		String response = scanner.nextLine();
		
		if(response.equalsIgnoreCase("i am EM'S coated"));{
		System.out.println("WELCOME HOME");
		}
		
		
		if(response.equalsIgnoreCase("i'm your mom"));
		System.out.println("sorry for the wait");	
		}
		
		else {
			//System.out.println("state your reason for coming");
		//}
	}

