import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BankingCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner  sc = new Scanner(System.in);
		int amount = 0;
		int balance =100000;
		int minBal = 10000;
		
		System.out.println("How many no. of person are there in Queue ..?");
		int no = sc.nextInt();
		
		Queue<Object> q = new LinkedList<Object>();
		
		for(int i=1;i<=no;i++) {
			
			System.out.println("Enter the name of "+i+" person..!");
			String name = sc.next();
			
			boolean t = q.add(name);
			
			if(t == false) {
				System.out.println("Name not Inserted.");
			}
		}
		String nameInQ = q.toString();
		System.out.println(nameInQ);
		
		
	for(int i=1;i<=no;i++) {
		
		System.out.println(i+" Person");
		
		System.out.println("Enter your Choice :- 1. Deposit Cash  2. Withdraw Cash.");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			
			
			
			System.out.println("How Much Amount want to Deposit ?");
			int amount1 = sc.nextInt();
			
			balance = balance + amount1;
			
			System.out.println("Deposited successfully.");
			System.out.println("Bank Balance is -- "+balance);
			
			break;
			
		case 2:
			
			if(balance <= minBal) {
				System.out.println("You Cannot Withdraw the Amount (Minimum Bal of Bank.)");
			}
			else {
			
			System.out.println("How Much Amount want to Withdraw ?");
			int amount2 = sc.nextInt();
			
			if(amount2>(balance)) {
				System.out.println("Amount is over the Balance.  Thank You ..!");
				System.out.println("\n");
			}
			else {
				balance = balance - amount2;
			
				System.out.println("Withdrew cash successfully.");
				System.out.println("\n");
				System.out.println("Bank Balance is -- "+balance);
				System.out.println("\n");
				
			}
			}
			break;
			default:
				System.out.println("Enter the correct option.");
				System.out.println("\n");
				System.out.println("\n");
		
		}
		q.remove();System.out.println(q);
		System.out.println(balance);
		
	}
		
		
	}

}
