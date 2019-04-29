import java.util.Deque;
import java.util.LinkedList;
import  java.util.Queue;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check palindrome. ");
		String str = sc.next();
		
		char charArray[] = str.toCharArray();
		
		Deque<Character> dq = new LinkedList<>();
		
		int i =0;
		while(i<str.length()) {
			dq.addFirst(str.charAt(i++));
		}
		
		System.out.println(dq+" "+dq.size());
		System.out.println(isPalindrome(dq));
	}
	
	static boolean isPalindrome(Deque<Character> dq) {
		
		if(dq.size() % 2 == 0) {
			while(dq.size() != 0) {
				
				char c  = dq.removeFirst();
				char c2 = dq.removeLast();
				
				if(c != c2) {
					return false;
				}
			}
		}else {
			
			while(dq.size() == 1) {
				
				char c  = dq.removeFirst();
				char c2 = dq.removeLast();
				
				if(c != c2) {
					return false;
			}
							
		}
		
	}
		return true;
	
}
}
