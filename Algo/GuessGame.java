
/******                     ********************
 * Execution         	    : javac GuessGame.java
 * Purpose            	    : Guessing the Number Gsme. 
 * @file                    : GuessGame.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
import java.util.Scanner;

public class GuessGame {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user who have to guess the number between the range.

		System.out.println("Guess Any Number Between 0 to 127. ");
		sc.next();
		
		try{
			System.out.println("Guess no is :- "+find());
			
		}
		catch(Exception e) {
			System.out.println("Error :- " +e);
		}
		
		}
// find function for the  guessing of the user number.

	public static int find() {
		
	
		 int low=0,high=127,mid;
		 
// calculating the mid of the range in which the user number is present.

		 while(low!=high) {
			 
			 mid = (low+high)/2;
			 System.out.println("Enter the 1 if Your no is Between  "+low+" - "+mid+"\n Enter 2 if Your No is Between  "+(mid+1)+" - "+high);
			 
			int input = sc.nextInt();
			mid = (low+high)/2;
			if( input==1) {
				high = mid;
			}else {
				low = mid+1;
			}
		 }
		 return low;
		
		
	}

}
