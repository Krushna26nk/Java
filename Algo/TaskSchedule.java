
/******                     ********************
 * Execution         	    : javac TaskScheduling.java
 * Purpose            	    : Management of the task input from user. 
 * @file                    : TaskSchedule.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
import java.util.Scanner;

public class TaskSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No. Of Task. ");
		int n = sc.nextInt();
		
		int dead[] = new int[n];
		int min[] = new int[n];
		
		for( int i=0; i < min.length ; i++) {
			
			System.out.println("Task " +i+ "time");
			min[i] =  sc.nextInt();
			
			System.out.println("Task " +i+"Deadline");
			dead[i] = sc.nextInt();
		}
		
	}

}
