
import java.util.Scanner;

public class Permutation 
{
	public static class GFG { 
		  
	    // Function to print all the permutations of str 
	  public static void printPermutation(String str, String ans) 
	    { 
	  
	        // If string is empty 
	        if (str.length() == 0) 
	        { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) 
	        { 
	            // i th character of str 
	            char ch = str.charAt(i); 
	  
	            // Rest of the string after excluding  
	            // the ith character 
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	  
	            // Recurvise call 
	            printPermutation(ros, ans + ch); 
	        } 
	    } 
	  

	    public static void main(String[] args) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a string to print the Permutations. ");
	    	String n=sc.next();
	        //String s = "abb"; 
	        printPermutation(n, ""); 
	    } 
	} 
}