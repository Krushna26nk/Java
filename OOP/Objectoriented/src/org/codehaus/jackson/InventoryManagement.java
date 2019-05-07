package org.codehaus.jackson;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class InventoryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		String path = "/home/admin1/Desktop/Fellow/OOP/Objectoriented/inventory.json";
		
			// Reading file from the System.
			
			File fileRead = new File(path);
			
			// creation of the object of JSON Object MApper.
			
			ObjectMapper objMapper = new ObjectMapper();
			
			System.out.println("Enter the option of which you wat the detail 1. Rice  2.Wheat 3.Pulses");
			int ch = sc.nextInt();
			String str = "";
			String temp = str;
			
			boolean test = true;
			
			switch(ch) {
			case 1 :
				temp = "Rice";
				break;
			case 2 :
				temp= "";
				temp = "Wheat";
				break;
			case 3 :
				temp= "";
				temp = "Pulses";
				break;
			default:
				System.out.println("Enter the correct option.");
				test = false;
				break;
			}
			
			if(test) {
				int price=0;
			try {
				
				// getting the " Rice " field From the JSON Data File
				
				JsonNode rootnode = objMapper.readTree(fileRead);
				JsonNode inventory = rootnode.get(temp);
				
				System.out.println();
				System.out.println("      Different types of "+temp+" are:-");
				System.out.println();
				 
				
				for(JsonNode node : inventory) {
					String name = node.path("Name").asText();
					price = node.path("Price").asInt();
					int weight = node.path("Weight").asInt();
					
					
					System.out.println("Name of Rice is :- '"+name+"'   and price per KG is - "+price+"... So total price of GOOD is "+(weight*price));
				}
				
				
			}
			catch(Exception e) {
				System.out.println("Error :- "+e);
			}
			}
			
			else {
				System.out.println();
			}
			
		
	}

}
