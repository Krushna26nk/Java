package blProgramms;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "Hello <<username>> , How are You ?";
		System.out.println(str);
		
		System.out.println("Enter Your Name ..");
		String name;
		name = sc.next();
		
		System.out.println(str.replace("<<username>>", name));
		
	}

}
