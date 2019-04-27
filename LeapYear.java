
/******                     ********************
 * Execution         	    : javac LeapYear.java
 * Purpose            	    : identify the user input year is leap or not. 
 * @file                    : LeapYear.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package blProgramms;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		// user input of Year to check the Leap Year.
		
		System.out.println("Enter The Year To Check");
		year = sc.nextInt();
		
		
		// condition for leap year.
		
		if((year%4 == 0 && year%100 != 0 ) || year%400 == 0) {

		 System.out.println("Year is Leap :- "+year);
			
		}else
		{
			System.out.println("Year is not Leap Year :- "+year);
		}
		

	}

}
