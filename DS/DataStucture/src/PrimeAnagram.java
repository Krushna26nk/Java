import java.util.Scanner;

public class PrimeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no of  range. ");
		int first = sc.nextInt();
		
		System.out.println("Enter the lst no of range. ");
		int last = sc.nextInt();
		
		System.out.println("Prime Numbers Between the range are :- ");
		primeAnagram(first,last);
		
	}
	
	static int[] primeChecker(int first , int last) {
		boolean result =true;
		int count=0;
		int primeno[] = new int[last];
		
		for(int i=first;i<last;i++) {
			
				for(int j=2;j<i;j++) {
					
					if(i % j == 0) {
						result = false;
						break;
						
					}
					else {
						result=true;
					}
					
				}
				if(result == true) {
					
					primeno[count++] = i;
				}
			
		}
		return primeno;
		
	}
	
	public static void primeAnagram(int first , int last) {
		
		
		
	}

}
