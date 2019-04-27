
/******                     ********************
 * Execution         	    : javac Task.java 
 * Purpose            	    : Task Scheduling 
 * @file                    : Task.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package JavaProgramms;
import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter no of task");  		// user input for How Much Task They Want to do.
	int tasks = s.nextInt();
	int[] dead = new int[tasks] ;
	int[] min = new int[tasks] ;
	for (int i = 0; i < min.length; i++) {
		System.out.println("task " +i+ " time");		// entered task start time.
		min[i] = s.nextInt();
		System.out.println("task "+i+" deadline");		// entered task Deadline Time.
		dead[i] = s.nextInt();
	}
	
}
}
