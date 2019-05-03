

/******                     ********************
 * Execution         	    : javac Utility.java
 * Purpose            	    : 
 * @file                    : Utility.java
 * @author  Krushna
 * @version 1.0
 ******                     ******************/

package blProgramms;

public class Utility {

	// bubble sort for integers
	
	public static int[] bubbleSort(int arr[]) {
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
					
			}
		}
		return arr;
		
	}
	
	// bubble sort for Strings
	
	public static String[] bubbleSort(String aar[]) {
		
		int temp,j;
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++) {
				
				if(arr[j].compareTo(arr[j+1]>0))
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		return arr;
	}
	
	//Insertion Sort
	
	public static String[] insertionSort(String inputArray[]) {
		
		int linenumber = inputArray.length;
		int i,j;
		String key;
		
		for(j = 1; j<lineNumber ; j++) {
			
			key = inputArray[j];
			i = j- 1;
			while( i>=0) {
				
				if(key.compareTo(inputArray[i]) > 0) {
					break;
				}
				
					inputArray[i+1] = inputArray[i];
					i--;
			}
			
			inputArray[i+1] = key;
			
		}
		return inputArray;
		
	}


	// to binary conversion
	public static int[] toBinary(int d) {
		String bin = "";
		while (d != 0) 
		  {
			bin = (d % 2) + bin;
			d = d/2;
		  }
		while (bin.length() % 4 != 0)
		  {  
			bin = 0 + bin;
		  }
		return stringToIntArray(bin);
	}
	
	static int[] stringToIntArray(String bin) 
	  {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) 
		{
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	  }

	// to decimal conversion
	
	public static int toDecimal(int[] binary) 
	 {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		 {
			if (binary[i] == 1)
			{
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		  }
		return dec;
	 }
	


	
}
