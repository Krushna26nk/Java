
/******                     ********************
 * Execution         	    : javac TwoDArray.java
 * Purpose            	    : Implementation of 2 dimensional array. 
 * @file                    : TwoDArray.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;

public class TwoDArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows,columns,i,j;
		
		System.out.println("Enter No of rows :- ");					// input No. Of Rows..
		rows = sc.nextInt();
		
		System.out.println("Enter the no of columns :- ");			// input No. Of Columns
		columns = sc.nextInt();
		
		int[][] intArray = new int[rows][columns];
		
		System.out.println("enter the values :- ");				// input values to the 2D array...
		for( i = 0 ;i  < rows ; i++) {
			for( j = 0 ; j< columns ; j++) {
				intArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D array is :- ");				// Display the Output of the 2D Array.
		for(i = 0; i < rows ; i++) {
			for(j = 0 ;j < columns ;j++) {
				System.out.print("  "+intArray[i][j]);
			}
			System.out.println("");
		}

	}

}
