package blProgramms;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter The List Of Words. ");
			String str = sc.next();
			
			String[] str1 = str.split(" ");
			
			String input[] = Utility.inserSort(str);
			
			for( String string : input) {
				System.out.println(string);
			}
		}catch(Exception e) {
			System.out.println("error : "+e);
		}
	}

}
