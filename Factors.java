package blProgramms;
import java.util.Scanner;
public class Factors{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter The No");
        number = sc.nextInt();
        
        while(number%2 == 0) {
        	System.out.println(2 +" ");
        	number = number/10;
        }
        for(int i=3;i<=Math.sqrt(number);i+=2) {
        	while(number%i == 0) {
        		System.out.println(i);
        		number = number/i;
        	}
        }
        if(number>2) {
        	System.out.println(number);
        }
     }
}
