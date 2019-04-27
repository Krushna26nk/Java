
/******                     ********************
 * Execution         	    : javac VendingMachine.java
 * Purpose            	    : Calculating minimum no. of notes for an user input Rupees value. 
 * @file                    : VendingMachine.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package blProgramms;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rupees . ");
		int input = sc.nextInt();
		
		vendingMachine(input);
		
	}
	public static void vendingMachine(int inputRupees) {
		int notesArray[] = {1000,500,100,50,20,10,5,2,1};
		int i=0;
		while( i< notesArray.length) {
			if(inputRupees/notesArray[i] >0) {
				
				System.out.println("Vends "+inputRupees/notesArray[i]+" of "+notesArray[i]+" Rs.");
				inputRupees = inputRupees%notesArray[i];
			}
			i++;
		}
	}

}
