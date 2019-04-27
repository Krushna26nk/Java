
/******                     ********************
 * Execution         	    : javac Factors.java
 * Purpose            	    : Factors of the particular input number. 
 * @file                    : Factors.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;
public class Factors{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number;
        
        // User input Number.
        System.out.println("Enter The No");
        number = sc.nextInt();
        
        // Until the Condition
        while(number%2 == 0) {
        										// output if the number us fully divisible by 2
        	System.out.println(2 +" ");
        	number = number/10;
        }
        
        								// for loop for the calculation upto Squeare Root
        for(int i=3;i<=Math.sqrt(number);i+=2) {
        	while(number%i == 0) {
        		System.out.println(i);
        		number = number/i;
        	}
        }
        if(number>2) {
        	System.out.println(number);
        }
     }
}
