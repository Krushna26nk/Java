package blProgramms;
import java.util.Scanner;
public class PowerOfTwo{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        if(number<31)
             for(int i=1;i<number;i++){
                 System.out.println((Math.pow(2,i)));
                }
            else
                System.out.println("Number is greater");
            
     }
}

