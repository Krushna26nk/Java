package blProgramms;
import java.util.Scanner;

public class GuessGame {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Guess Any Number Between 0 to 127. ");
		sc.next();
		
		try{
			System.out.println("Guess no is :- "+find());
			
		}
		catch(Exception e) {
			System.out.println("Error :- " +e);
		}
		
		}

	public static int find() {
		
	
		 int low=0,high=127,mid;
		 
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
