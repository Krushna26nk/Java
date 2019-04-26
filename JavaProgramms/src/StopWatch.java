package blProgramms;
import java.util.Scanner;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to start the StoWatch :-");
		s.next();
		startTime();
		System.out.println("Enter any to stop the Stopwath");
		s.next();
		stopTime();
        elapsedTime();
	}

		static double start=0,stop=0;
		static double elapseT=0;
		 static void startTime()
	{
		long start = System.currentTimeMillis();
		System.out.println("Time Started at " + start);
		
	}

		 static void stopTime()
	{
		long stop = System.currentTimeMillis();
		System.out.println("Stop Time is "+stop);
	}

		 static void elapsedTime() 
	{
		elapseT =  (stop - start);	
		System.out.println("Elapsed time is " +elapseT);
	}
}