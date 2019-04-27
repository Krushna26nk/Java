
/******                     ********************
 * Execution         	    : javac PowerOfTwo.java 
 * Purpose            	    : Power of the Number in terms of 2. 
 * @file                    : PowerOfTwo.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
import java.util.Scanner;
public class PowerOfTwo{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number;
        													// user input of the number.
        number = sc.nextInt();
        if(number<31)
             for(int i=1;i<number;i++){
                 System.out.println((Math.pow(2,i)));		// math.pow() function for implementation.
                }
            else
                System.out.println("Number is greater"); 	
            
     }
}

