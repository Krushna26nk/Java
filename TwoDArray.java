package blProgramms;
import java.util.Scanner;

public class TwoDArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows,columns,i,j;
		
		System.out.println("Enter No of rows :- ");
		rows = sc.nextInt();
		
		System.out.println("Enter the no of columns :- ");
		columns = sc.nextInt();
		
		int[][] intArray = new int[rows][columns];
		
		System.out.println("enter the values :- ");
		for( i = 0 ;i  < rows ; i++) {
			for( j = 0 ; j< columns ; j++) {
				intArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D array is :- ");
		for(i = 0; i < rows ; i++) {
			for(j = 0 ;j < columns ;j++) {
				System.out.print("  "+intArray[i][j]);
			}
			System.out.println("");
		}

	}

}
