
/******                     ********************
 * Execution         	    : javac SumOfIntegers.java 
 * Purpose            	    : Calculate The Sum Of integers to zero. 
 * @file                    : SumOfIntegers.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/



package JavaProgramms;
import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[10];
		int i,j,k,l,n,flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		// user input for how much no they wanted to store.
		
		System.out.println("how much no ..? ");
		n = sc.nextInt();
		System.out.println("enter the values into array :- ");
			
		
		// store the number into an array.
			for(i=0;i<n;i++) {
				intArray[i] = sc.nextInt();
			}
			
			// Iteration for the addition of the number and next number.
			
			for(j=0;j<n-2;j++) {
				for(k=j+1;k<n-1;k++) {
					for(l=k+1;l<n;l++) {
						
						if((intArray[j] + intArray[k] + intArray[l]) == 0) {
							System.out.print(intArray[j]);
							System.out.print(" ");
							System.out.print(intArray[k]);
							System.out.print(" ");
							System.out.print(intArray[l]);
							System.out.println("");
							flag=1;
						}
							
						
					}
				}
			}
			if(flag==0) {
				System.out.println("not found ..");
			}
		
	}

}
