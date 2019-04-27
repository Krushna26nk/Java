
/******                     ********************
 * Execution         	    : javac OrderdList.java
 * Purpose            	    : ordered list implementation using stack.
 * @file                    : OrderedList.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;

import java.util.Scanner;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileReader;

public class OrderdList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stck = new Stack<>(); 
		Scanner sc = new Scanner(System.in);
try {
		BufferedReader bf = new BufferedReader(new FileReader("/home/admin1/Desktop/sampleInteger.txt"));
		try {
			
			int  readline = bf.read();
			
			
			for(int i=0;i<readline.length;i++) {
				stck.push(array[i]);
				
			}
			System.out.println(stck);
		}			
		catch(Exception e) {
			System.out.println("Error :- "+e);
		}
		
		
		
}catch(Exception e) {
	
	System.out.println("Error :- "+e);
	
}
	}

}
