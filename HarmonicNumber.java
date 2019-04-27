
/******                     ********************
 * Execution         	    : javac HarmonicNumber.java
 * Purpose            	    : Harmonic number of an user input number. 
 * @file                    : HarmonicNumber.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double number;
		double result=0;
		
		 // Input Number From User
		System.out.println("Enter The Number To Print Harmonic number.");
		number = sc.nextInt();
		
		
		// For Loop Until The Last Number
		for(int i = 0; i <= number ; i++) {
			
			result = result + (double)1/number;
			System.out.println(result);
		}
		
		// Last Desired  Output Number.
		System.out.println("Harmonic No. Output is :- "+result);
	}

}
