
/******                     ********************
 * Execution         	    : javac StopWatch.java 
 * Purpose            	    : Calculate Elapsed Time. 
 * @file                    : StopWatch.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/




package JavaProgramms;
import java.util.Scanner;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		// user input for which on what time stopwatch should start and stop.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to start the StoWatch :-");
		s.next();
		startTime();
		System.out.println("Enter any to stop the Stopwath");
		s.next();
		stopTime();			// stop the stopwatch function
        elapsedTime();		// elapse time calculate function
	}

		static double start=0,stop=0;
		static double elapseT=0;
		 static void startTime()
	{
		long start = System.currentTimeMillis();				// output of started time.	
		System.out.println("Time Started at " + start);
		
	}

		 static void stopTime()
	{
		long stop = System.currentTimeMillis();				// output of stop time
		System.out.println("Stop Time is "+stop);
	}

		 static void elapsedTime() 
	{
		elapseT =  (stop - start);			// difference between both the time  => elapsed time.
		System.out.println("Elapsed time is " +elapseT);
	}
}
