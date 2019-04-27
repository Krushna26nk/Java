
/******                     ********************
 * Execution         	    : javac BubbleSort.java
 * Purpose            	    : Implementation Of the Bubble Sort Algorithm. 
 * @file                    : BubbleSortAlgo.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package blProgramms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,15,24,40,54};
		int input[] = Utility.bubbleSort(arr);
		System.out.println("Sorted Array :- ");
		
		for( int i =0 ; i<arr.length;i++ ) {
			System.out.println(input[i]);
		}
		
	}

}
