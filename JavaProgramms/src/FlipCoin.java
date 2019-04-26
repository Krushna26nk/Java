package blProgramms;
import java.util.Scanner;
import java.io.*;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num,heads=0, tails=0;
		System.out.println("Enter no. Of to flip Coin");
		num = sc.nextInt();
		int flip = num;
		for(int i = 0 ;i<flip;i++) {
			
			if( Math.random() < 0.5) {
				heads++;				
			
			}else {
				tails++;
			}
			
		}
		System.out.println("Heads"+heads);
		System.out.println("Tails"+tails);
		
		int headPercentage = ( heads * 100 ) / flip;
		int tailPercentage = ( tails * 100 ) / flip;
		
		System.out.println("Heads Percentage :- "+( heads * 100 ) / flip);
		System.out.println("Tails Percentage :- "+( tails * 100 ) / flip);
		System.out.println("");
		System.out.println("Heads vs Tails Percentage :- "+( headPercentage * 100 ) / tailPercentage+" "+( tailPercentage * 100 ) / headPercentage);
		
	}

}
