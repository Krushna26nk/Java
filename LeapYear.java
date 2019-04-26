package blProgramms;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter The Year To Check");
		year = sc.nextInt();
		
		if((year%4 == 0 && year%100 != 0 ) || year%400 == 0) {

		 System.out.println("Year is Leap :- "+year);
			
		}else
		{
			System.out.println("Year is not Leap Year :- "+year);
		}
		

	}

}
