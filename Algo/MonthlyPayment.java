
/******                     ********************
 * Execution         	    : javac MonthlyPayment.java
 * Purpose            	    : calculating the monthly payment according to principle amount and rate of interest.
 * @file                    : MonthlyPayment.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Y , R , P;
		
		Scanner sc = new Scanner(System.in);
// input value of year of amount
		
		System.out.println("Enter the years :- ");
		Y =sc.nextInt();

// input for rate of interest.
		
		System.out.println("Enter the Rate :- ");
		R = sc.nextInt();

// input for the principle amount
		
		System.out.println("Enter the Principal Amount :- ");
		P = sc.nextInt();
		
		double n = 12 * Y;
		double r = R / ( 12 * 100);
		
		double denominatorR = 1 + r;
		double minusN = -n;
		
		double power = (double)(Math.pow(denominatorR,minusN));
		
		double denominator = (1 - power);

// formula to calculate the monthly payment

		double payment = ( P * r ) / denominator;
// desired output		
		System.out.println("Payment is :- "+payment+ "  Per Month.");
	}

}
