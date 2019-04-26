package blProgramms;

import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BinarySearchWord {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int res;
		res = binarySearch();
		if(res == 0) {
			System.out.println("Word Found");
		}
		else {
			System.out.println("Word Not found");
		}
		
	}
		public static int binarySearch() {
//			Scanner sc = new Scanner(System.in);
				String temp = null;
				
				try {
					
					BufferedReader fileRead = new BufferedReader(new FileReader("/home/admin1/Desktop/sample.txt"));
				                // For Reading The Line From The File
					try {
						String a = fileRead.readLine(); 
					String arr[] = a.split(" ");  // Splitting the words from file.	
					
					for( int i = 0; i<arr.length ; i++) {
						
						for(int j = i+1 ; j<arr.length ; j++) {
							
							if(arr[i].compareTo(arr[j]) > 0) {          // check if arr[j] is greater than arr[i]
								
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								
							}
							
						}
						
					}
					System.out.println("List Of Words are :- ");
					for(int i =0 ;i<arr.length;i++) {
						if(i<arr.length) {
							
							System.out.println(arr[i]+"");
						
						}else if( i == arr.length - 1) {
						
//							break;
							
						}
					}
					System.out.println();
				
					System.out.println("Enter The Word You Want To Search. :- ");
					String inputWord = sc.next();
					
					int first=0 , last =arr.length -1;
					while( first <= last) {
						
						int mid = (first + last) / 2;
						if( inputWord.compareTo(arr[mid]) == 0) {
							return mid;
						}
						else if(inputWord.compareTo(arr[mid]) > 0) {
							
							first = mid +1;
							
						}else {
							last = mid -1;
						}
						
					}
				}
				catch(IOException e){
					System.out.println(e);
				}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
				return -1;
		}
		

}

