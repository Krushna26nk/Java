package blProgramms;
import java.util.Scanner;
public class RootsOfEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int FirstRoot,SecondRoot;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Values Of a , b and c :- ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int B = (b*b);
		int FourAC = (4 * a * c); 
		
		int delta = (B - FourAC);
		
		System.out.println(delta);
		
		int SquarRoot = (int)(Math.sqrt(delta));
		
		FirstRoot = (-b+SquarRoot)/(2*a);
		SecondRoot = (-b-SquarRoot)/(2*a);
		
		System.out.println("Roots Of Equation are : "+FirstRoot+" and "+SecondRoot);
	}

}
