package blProgramms;

import java.util.Deque;
import java.util.LinkedList;


public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
			try {
				Deque<String> dq = new LinkedList<>();
				Deque<String> dq1 = new LinkedList<>();
				
				String str = "aba";
				String strArray[] = str.split("");
				
				for(i=0;i<strArray.length;i++) {
					
//					System.out.println(strArray[i]);
					dq.addFirst(strArray[i]);					
				}

				for(k=dq.size()-1;k>=0;k--) {
					dq1.addFirst(strArray[k]);;
				}
				System.out.println(dq);
				System.out.println(dq1);
				
				
			}
			catch(Exception e) {
				System.out.println("Error :- "+e);
			}
					
		
	}

}
