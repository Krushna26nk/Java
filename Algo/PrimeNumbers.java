
/******                     ********************
 * Execution         	    : javac PrimeNumbers.java
 * Purpose            	    : Finding out the prime  numbers 
 * @file                    :PrimeNumbers.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp=0;	

		for(i=1;i<=1000;i++) {
			for(j=2;j<=i-1;j++) {
				if(i%j == 0) {
					temp = temp+1;
				}
			}
			if(temp == 0) {
				System.out.print(i+" ");
			}else {
				temp = 0;
			}
		}
		
}
}
