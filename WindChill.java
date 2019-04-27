
/******                     ********************
 * Execution         	    : javac WindChill.java
 * Purpose            	    : Calculation for the wind chill. 
 * @file                    : WindChill.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package JavaProgramms;
import java.util.Scanner;

public class WindChill {
	
	
	public void windChillFunction(int temperature,int speed) {
		
	// condition on which the input value should lie.
	
		if( ( temperature < 50) && ((speed < 120) || speed > 3 )) {
		
			float first = (float)(0.6215 * temperature);
			float second = (float)((0.4275*temperature) - 35.75);
			float thirdPower = (float)(Math.pow(speed, 0.16));
			
			// formula for calculation of the wind Chill....
			
			float Formula = (float)( ( 35.74 ) + first + (second * thirdPower ));
			
			// output of the WindChill Formula.....
			System.out.println(Formula);
		}else {
			
			System.out.println("entered temp. and speed is not valid");
			
			// if condition  false then print this.
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,v;
		
		// input from the user for the Temperature and Wind speed.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  the temperature (t) and wind speed (v)");
		t = sc.nextInt();					// temperature
		v = sc.nextInt();					// wind speed
		
		WindChill wc = new WindChill();
		
		wc.windChillFunction(t,v); 
		
//		windChillFunction(t,v);
	}

}
