import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;

public class PrimeNumber2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q = new LinkedList<>();
		
	int i;
	int j,temp =0;
	String str ="";
	
	// for loop for finding the prime numbers.
	
	for(i=1;i<1000;i++) {
		
		for(j=2;j<i;j++) {
			
			if(i%j == 0) {
				temp = temp + 1;
			}
			
		}
		if(temp == 0) {
			str = str + i + " ";
		}
		else {
			temp =0;
		}
		
	}// end of for loop
//	System.out.println(str);
	
	String[] strArray = str.split(" ");
			
//	for(i=0;i<strArray.length;i++) {
//		System.out.println(strArray[i]);
//	}
	for(j=0;j<strArray.length;j++) {
		int lastindex =strArray[j].length()-1;
		
		int first = strArray[j].charAt(0);
		int last = strArray[j].charAt(lastindex);
		
		
		if(first == last){
			q.add(strArray[j]);
			
		}
		else {
		
		}
		
	}
	System.out.println(q);
		
	
}
			
}
	
	