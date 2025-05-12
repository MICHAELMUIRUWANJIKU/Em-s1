package papers;
import java.util.Scanner;
public class BUTCHERYMAN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kilos, totalkilos, totalcost;
		System.out.println("enter the kilograms sold today");
		kilos = scanner.nextInt();
		
		totalcost = 0;
		if(kilos<=6) {
			totalcost = kilos * 475; 
		}
		else {
			int extrakilos = kilos - 6;
			totalcost = ((extrakilos * 500) + (6 * 475));
		}
		// TODO Auto-generated method stub
		System.out.println("total kilos sold today is = "+ kilos);
		System.out.println("total cost of meat sold today is = Kshs."+totalcost);
	}

}
