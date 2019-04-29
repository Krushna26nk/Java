import java.util.Scanner;

public class PrimeNumber2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,k,l;
		int array[][] = new int[100][100];

		for(i=1;i<1000;i++) {
			
			if(i==2 || i==3) {
				System.out.println(i);
			}
			
			for(j=2;j<i/2;j++) {
				
				 if(i%j == 0) {
					System.out.println("Not prime");
				}
				else {
					System.out.println(i);
				}
				
			}
			
		}
		
	}

}
