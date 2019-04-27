
/******                     ********************
 * Execution         	    : javac FlipCoin.java
 * Purpose            	    : Flip the coin and calculate the percentage of win and loss. 
 * @file                    : TicTacToe.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;
import java.io.*;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num,heads=0, tails=0;
		System.out.println("Enter no. Of to flip Coin");		// user input to flip the coin.
		num = sc.nextInt();
		int flip = num;
		for(int i = 0 ;i<flip;i++) {
			
			if( Math.random() < 0.5) {					// condition where the HEAD and TAIL Lies.
				heads++;				
			
			}else {
				tails++;
			}
			
		}
		System.out.println("Heads"+heads);  		// number of HEADS and TAILS Occured.
		System.out.println("Tails"+tails);
		
		int headPercentage = ( heads * 100 ) / flip;	// Percentage of the HEAD and TAIL .
		int tailPercentage = ( tails * 100 ) / flip;
		
		System.out.println("Heads Percentage :- "+( heads * 100 ) / flip);
		System.out.println("Tails Percentage :- "+( tails * 100 ) / flip);
		System.out.println("");
		//System.out.println("Heads vs Tails Percentage :- "+( headPercentage * 100 ) / tailPercentage+" "+( tailPercentage * 100 ) / headPercentage);
		
	}

}
