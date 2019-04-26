package blProgramms;
import java.util.Scanner;

public class WindChill {
	
	
	public void windChillFunction(int temperature,int speed) {
		
	
	
		if( ( temperature < 50) && ((speed < 120) || speed > 3 )) {
		
			float first = (float)(0.6215 * temperature);
			float second = (float)((0.4275*temperature) - 35.75);
			float thirdPower = (float)(Math.pow(speed, 0.16));
			
			float Formula = (float)( ( 35.74 ) + first + (second * thirdPower ));
			
			System.out.println(Formula);
		}else {
			
			System.out.println("entered temp. and speed is not valid");
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,v;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  the temperature (t) and wind speed (v)");
		t = sc.nextInt();
		v = sc.nextInt();
		
		WindChill wc = new WindChill();
		
		wc.windChillFunction(t,v); 
		
//		windChillFunction(t,v);
	}

}
