
/******                     ********************
 * Execution         	    : javac SqrRoot.java
 * Purpose            	    : Square root using epsilon 
 * @file                    : SqrRoot.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
import java.util.Scanner;

public class SqrRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No To Find The Squeare Root Of :- ");
		double num = sc.nextInt();
		
		double result = sqRoot(num);
		System.out.println("Square Root is : -"+result);
		
	}
	public static void sqRoot(double c) {
		
		double t = c;
		double epsilon = 1e-15;
		
		while(Math.abs( t - c / t) > epsilon * t) {
			t = ( c /t + t) / 2;
		}
		return t;
	}

}
