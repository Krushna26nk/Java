import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq = new ArrayDeque<>();
		Deque<String> emptyDQ = new ArrayDeque<>();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("/home/admin1/Desktop/numbers.txt"));
			
			try {
				
				String readData =	fileReader.readLine();
				String[] array = readData.split(" ");
				
				for(int i=0;i<array.length;i++) {
					dq.add(array[i]);
				}
				
				System.out.println(dq);
				
				for(Iterator itr = dq.iterator();itr.hasNext();) {
					System.out.println(" "); 
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
