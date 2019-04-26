package blProgramms;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double celciusTemp;
		double FarenhietTemp;
		
		System.out.println("Enter The Celcius Temperature :-");
		celciusTemp = sc.nextInt();
		
		System.out.println("Enter The Farenhite Temperature :-");
		FarenhietTemp = sc.nextInt();
		
		double celToFaren = ( celciusTemp * 1.8) + 32;
		
		double FarenToCelcius = ( FarenhietTemp - 32 ) * (0.56);
		
		System.out.println("Your Converted Celcius Temperature is   " + celToFaren + " into Farenhiet Temperature.");
		System.out.println("Your Converted Farenhiet Temperature is   " + FarenToCelcius + " into celcius Temperature.");
	}

}
