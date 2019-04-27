

/******                     ********************
 * Execution         	    : javac ReplaceString.java
 * Purpose            	    : Replacing user input string. 
 * @file                    : ReplaceString.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/



package JavaProgramms;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Standered String.
		
		String str = "Hello <<username>> , How are You ?";
		System.out.println(str);
		
		// user input string to replace the original String.
		
		System.out.println("Enter Your Name ..");
		String name;
		name = sc.next();
		
		// Output of The Replace String.
		
		System.out.println(str.replace("<<username>>", name));
		
	}

}
