package blProgramms;
import java.util.Scanner;

public class MergeSort {

	int inputArray[];
	int tempMergArray[];
	int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArray[]= {48,5,15,24,75,49,25,21};
		MergeSort ms = new MergeSort();
		
		ms.sort(inputArray);
		
		for(int i : inputArray) {
			System.out.println(i + " ");
		}
		
	}
	public void sort(int[] inputArray) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergArray = new int[length];
		
		divideArray(0, length - 1);
	}
	
	public void divideArray(int lowerIndex,int higherIndex) {
		
		if(lowerindex < higherindex) {
			
			int middleIndex = (lowerIndex + (higherIndex - lowerIndex)) / 2;
			divideArray(lowerIndex ,middleIndex);
			
			divideArray((middleIndex + 1) , higherIndex );
			
			mergeArray(lowerIndex , middleIndex , higherIndex );
			
		}
		
	}
	public void mergeArray(int lowerIndex , int middleIndex , int higherIndex) {
		
	for(int i = lowerIndex ; i <= higherIndex ; i++) {
		
		tempMergeArray[i] = array[i];
	}
	int i  = lowerIndex;
	int j = iddleIndex + 1;
	int l = lowerIndex;
	
	while(i < = middleIndex && j <= higherIndex) {
		
		if(tempMergeArray[i] <= tempMergeArray[j] ) {
			array[k] = tempMergeArray[i];
		}
		else {
			
			array[k] = tempMergeArray[j];
			j++;
			
		}
		k++;
	}
	while( i <= middleIndex) {
		array[k] = tempMergeArray[i];
		k++;
		i++;
		
	}
	}
}
