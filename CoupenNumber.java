
/******                     ********************
 * Execution         	    : javac CoupenNumber.java
 * Purpose            	    : Generating Different Coupen Number
 * @file                    : CoupenNumber.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;

public class CoupenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num,size=0;
		System.out.println("Enter no ( How Many ) : ");
		num = sc.nextInt();
		
		for(size = 0 ; size<num ; size++) {
			System.out.println( Math.round(Math.random()*10000));
		}
	}

}
