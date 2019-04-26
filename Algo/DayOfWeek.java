package blProgramms;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Date :- ");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		dayOf(d,m,y);
		
	}
	public static void dayOf(int d , int m ,int y) {
		
		int y0 = y - (14*m)/12;
		int x = y0 + ( y0/4 ) - ( y0/100 ) + ( y0/400);
		int m0 = m + 12 * ( (14 - m)/12 ) - 2;
		int d0 = (d + x + ( 31*m0 ) / 12) % 7;
		
		switch(d0) {
		
		case 0 : System.out.println("This is Sunday . ");
		break;
		
		case 1 : System.out.println("This is Monday .");
		break;
		
		case 2 : System.out.println("This is Tueday .");
		break;
		
		case 3 : System.out.println("This is Wednsday .");
		break;
		
		case 4 : System.out.println("This is Thursday .");
		break;
		
		case 5 : System.out.println("This is Friday .");
		break;
		
		case 6 : System.out.println("This is Saturday .");
		break;
		
		default:
			System.out.println(d0);
		}
		
//		System.out.println(d0);
	}

}
