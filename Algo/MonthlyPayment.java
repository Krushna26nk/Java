package blProgramms;
import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Y , R , P;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the years :- ");
		Y =sc.nextInt();
		
		System.out.println("Enter the Rate :- ");
		R = sc.nextInt();
		
		System.out.println("Enter the Principal Amount :- ");
		P = sc.nextInt();
		
		double n = 12 * Y;
		double r = R / ( 12 * 100);
		
		double denominatorR = 1 + r;
		double minusN = -n;
		
		double power = (double)(Math.pow(denominatorR,minusN));
		
		double denominator = (1 - power);
		double payment = ( P * r ) / denominator;
		
		System.out.println("Payment is :- "+payment+ "  Per Month.");
	}

}
