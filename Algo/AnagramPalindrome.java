package blProgramms;

public class AnagramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp=0;	
		int arr[] = new int[1000];

		for(i=1;i<=1000;i++) {
			for(j=2;j<=i-1;j++) {
				if(i%j == 0) {
					temp = temp+1;
				}
			}
			if(temp == 0) {
				arr[0] = i;
				System.out.print(i+" ");
			}else {
				temp = 0;
			}
		}
	}

}
