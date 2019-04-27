
/******                     ********************
 * Execution         	    : javac EuclideanDistance.java
 * Purpose            	    : implementation of the Euclidean Distance Formula. 
 * @file                    : EuclideanDistance.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=0,y1=0,x2,y2;
		
		// Number of inputs from the User...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x2 and y2 co-ordinates :- ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		// calculating differnce between them.
		
		int X = x2 - x1;
		int Y = y2 - y1;
		
		// eucleadean Formula implementation. and output.
		
		int EuclideanFormula = (int) ( Math.pow(X, 2) + Math.pow(Y, 2) );
		
		System.out.println("x1 : "+x1+"    x2 : "+x2);
		System.out.println("y1 : "+y1+"    y2 : "+y2);
		System.out.println(" ");
		System.out.println("Answer is :- "+EuclideanFormula);
	}

}
