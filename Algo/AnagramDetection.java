package blProgramms;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	
	static void CheckAnagram(String string1 , String string2) {
//		String str3 = string1.replaceAll("\\s", "");
//		String str4 = string2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(string1.length() != string2.length() ) {
			status = false;
//			System.out.println("String are not Anagrams.");
		
		}else {
		
			char Array1[] = string1.toLowerCase().toCharArray();
			char Array2[] = string2.toLowerCase().toCharArray();
			
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			
			status = Arrays.equals(Array1, Array2);
			
		}
		if(status) {
			System.out.println("Strings are Anagram.");
		}else {
			System.out.println("Strings are not Anagram.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1;
		String str2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Two Strings To Check For Anagram.. :- ");
		str1 = sc.next();
		str2 = sc.next();
		
		CheckAnagram(str1,str2);
//		CheckAnagram("MotherInLaw","HitlerWomen");

	}

}
