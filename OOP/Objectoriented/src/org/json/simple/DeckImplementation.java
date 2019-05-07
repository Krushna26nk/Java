/*
 * Purpose: Program for distributing deck of cards and shuffling using 
 *               Random Class  giving to 4 player with 9 cards
 *	@author: Krushna Nikam.
 */	

package org.json.simple;

import java.util.Random;

public class DeckImplementation {

	public static String[][] cardDistribute(){
		String arr[][]= new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);
		
		String PlayerCard[][] = new String[4][9];
		for(int i=0;i<PlayerCard.length;i++) {
			
			for(int j=0;j<PlayerCard[i].length;j++) {
				
				PlayerCard[i][j] = arr[i][j];
			}
			
		}
		return PlayerCard;
		
	}
	
	// getting the Cards
	public static void cardInsert(String arr[][]) {
		String suits[]= {"Club","Diamond","Spades","Hearts"};
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","king","Queen","Ace"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j] = suits[i]+" "+rank[j];
			}
		}
	}
	
	// Shuffeling of the Cards
	public static void cardShuffle(String arr[][]) {
		Random r1 = new Random();
		for(int i=0;i<150;i++) {
			int x1 = r1.nextInt(4);
			int x2 = r1.nextInt(13);
			int x3 = r1.nextInt(4);
			int x4 = r1.nextInt(13);
			swap(arr, x1, x2, x3, x4);
		}
	}
	 	// Swapping of the Cards
	
	public static void  swap(String arr[][],int x1, int x2,int x3,int x4) {
		String temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[3][4] = temp;
	}
	
}

