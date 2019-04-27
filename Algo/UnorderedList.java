
/******                     ********************
 * Execution         	    : javac UnorderedList.java
 * Purpose            	    : Implementation of the unordered list using linked list.
 * @file                    : UnorderedList.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/


package blProgramms;
//import java.awt.List;
import  java.util.List;	
import java.util.LinkedList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnorderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		try {
			BufferedReader fileRead = new BufferedReader(new FileReader("/home/admin1/Desktop/sample.txt"));
			try {
				
				String file = fileRead.readLine();
				String array[] = file.split(" ");
				
				for(int i=0;i< array.length;i++) {	
					list.add(array[i]);
//					System.out.println(array[i]);
				}
				
				System.out.println("Before Removing :-");
				System.out.println();
				System.out.println(list);
				System.out.println();
				
				System.out.println("Enter the word you want to remove from list..?");
				String removing_word = sc.next();
				
				list.remove(removing_word);
				
				System.out.println(list.size());	
				System.out.println("After Removing the Word  from list");
				System.out.println();
				System.out.println(list);
				
			}catch( Exception e) {
				System.out.println("Error :- "+e);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error :- "+e);
		}
	}

}
