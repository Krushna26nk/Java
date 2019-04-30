
/******                     ********************
 * Execution         	    : javac ParenthesisBalanced.java
 * Purpose            	    : Implementation of the file reading using Stack.
 * @file                    : ParenthesisBalanced.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/



import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Stack;

import java.util.Queue;

public class ParenthesisBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		
		try {
			BufferedReader fileRead = new BufferedReader(new FileReader("/home/admin1/Desktop/ParaString.txt"));
			
			try {
				
				Stack<String> stck = new Stack<>();
				
				String str = fileRead.readLine();
				String array[] = str.split("");
				for( i=0;i<array.length;i++) {
					System.out.println(array[i]);
				}
				
				while(i<array.length-1) {
				
					if(array[i] == "(") {
						
						stck.push(array[i]);
						
					}else if(!stck.isEmpty() && array[i] == ")") {
						stck.pop();
						System.out.println("POp : -"+stck.pop());
					}
					else {
						i++;
					}
				}
				if(stck.isEmpty()) {
					System.out.println(stck.isEmpty());
				}
				
			}
			catch(Exception e) {
				System.out.println("Error :- "+e);
				
			}
		}
		catch(Exception e) {
			System.out.println("Error :- "+e);
		}
		
	}	

}
