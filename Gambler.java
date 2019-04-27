
/******                     ********************
 * Execution         	    : javac Gambler.java
 * Purpose            	    : Gambler game implementation 
 * @file                    : Gambler.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;

public class Gambler {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cash,goal,times;
		System.out.println("Enter The Cash :- ");			// user input For Cash .
		cash = sc.nextInt();		
		
		System.out.println("Enter The Goal :- ");			// user input For Goal HE wants to go .
		goal = sc.nextInt();
		
		System.out.println("Enter The No. times :- ");		//  Number of times input for playing the game.
		times = sc.nextInt();
		
		if(goal>cash) {
			gamblerGame(cash,goal,times); 
		}else {
			System.out.println("Cash Should Be less than Goal.");	// for valid input.
		}
		
	
		
	}

	public static void gamblerGame(int cash, int goal, int times) {
		// TODO Auto-generated method stub
		int wins = 0,loss = 0;
		int total=0;
		
		for(int i=0;i<times;i++) {
			if(cash>0 && cash<goal) {		// Based on occurences win.
				
				if(Math.random() < 0.5) {
					cash++;
					wins++;
//					times--;
					
					
				}else {					// based on random() function occurences loss.
					
					cash--;
					loss++;
//					times--;
	
				}
				
			}
			
			
		}
		System.out.println(wins);
		System.out.println(loss);
								
		// win percentages
		// and
		// Loss Percentages.
		
		 total = wins + loss;
		int winPercentage = ( (wins / total) * 100 );
		int lossPercentage = ( ( loss / total ) * 100 );
		
		
		
		System.out.println(total);
		
		System.out.println(winPercentage);
		System.out.println(lossPercentage);
	}

}
