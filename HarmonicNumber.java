package blProgramms;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double number;
		double result=0;
		System.out.println("Enter The Number To Print Harmonic number.");
		number = sc.nextInt();
		
		for(int i = 0; i <= number ; i++) {
			
			result = result + (double)1/number;
			System.out.println(result);
		}
		System.out.println("Harmonic No. Output is :- "+result);
	}

}
