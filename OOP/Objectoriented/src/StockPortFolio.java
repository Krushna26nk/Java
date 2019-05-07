import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.util.Scanner;

public class StockPortFolio {

	public static void main(String args[] ) {

		Scanner sc = new Scanner(System.in);
		ObjectMapper mapper = new ObjectMapper();
		
		StockPortFolio stPortFolio = new StockPortFolio();
		
		
		try {
			// Reading the file From System
			
			File readFile = new File("/home/admin1/Desktop/Fellow/OOP/Objectoriented/stock.json");

			// creating the object of JsonNode
			
			JsonNode node = mapper.readTree(readFile);
			JsonNode stck = node.get("Stocks_Detail"); 
//			System.out.println(stck);
			System.out.println();
			System.out.println("\t\t******---- Total Companies and Their Share Values ----*****");
			System.out.println();
			// iterating over the json file using json node.
			for(JsonNode node1 : stck) {
			
				String stckName = node1.path("Stock_Name").asText();
				
				int price = node1.path("Price").asInt();
				int shares = node1.path("Shares").asInt();
				int id = node1.path("id").asInt();
				
				System.out.println("\t\t"+id+"  "+stckName+"  Having  the  value  of   "+price+"  per  SHARE.");
			}
			System.out.println("\n\t\t*******     --------------     **********");
			
			stPortFolio.purchase();
		}
		// exception catching
		catch(Exception e) {
			System.out.println("Error :- "+e);
		}
	}
	public static void purchase() {
		

		ObjectMapper mapper = new ObjectMapper();
		File readFile = new File("/home/admin1/Desktop/Fellow/OOP/Objectoriented/stock.json");
		try {
		JsonNode node = mapper.readTree(readFile);
		JsonNode stck = node.get("Stocks_Detail");

		Scanner sc = new Scanner(System.in);
		System.out.println("Which of the above companies stacks you want to purchase. 1. TCS  2.LIC  3.HDFC  4.ICICI  5.INFO  6.Dr.REDLABZ ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
				JsonNode stck1 = stck.get(0);
				String stackName = stck1.path("Stack_Name").asText();
				int priceTCS = stck1.path("Price").asInt();
				
				System.out.println("how much shares you want to purchase .?");
				int no = sc.nextInt();
				
				System.out.println("Your Total Share Value Is  :--  "+(priceTCS * no)+" as "+priceTCS+" Rs. per Share.");
			break;
			
		case 2 :
			JsonNode stck2 = stck.get(1);
			String stackName1 = stck2.path("Stack_Name").asText();
			int priceLIC  = stck2.path("Price").asInt();
			
			System.out.println("how much shares you want to purchase .?");
			int no1 = sc.nextInt();
			
			System.out.println("Your Total Share Value Is  :--  "+(priceLIC * no1)+" as "+priceLIC+" Rs. per Share.");
			break;
			
		case 3 :
			JsonNode stck3 = stck.get(2);
			String stackName2 = stck3.path("Stack_Name").asText();
			int priceHDFC = stck3.path("Price").asInt();
			
			System.out.println("how much shares you want to purchase .?");
			int no2 = sc.nextInt();
			
			System.out.println("Your Total Share Value Is  :--  "+(priceHDFC * no2)+" as "+priceHDFC+" Rs. per Share.");
			break;
			
		case 4 :
			JsonNode stck4 = stck.get(3);
			String stackName3 = stck4.path("Stack_Name").asText();
			int priceICICI = stck4.path("Price").asInt();
			
			System.out.println("how much shares you want to purchase .?");
			int no3 = sc.nextInt();
			
			System.out.println("Your Total Share Value Is  :--  "+(priceICICI * no3)+" as "+priceICICI+" Rs. per Share.");
			break;
			
		case 5 :
			JsonNode stck5 = stck.get(0);
			String stackName4 = stck5.path("Stack_Name").asText();
			int priceINFO = stck5.path("Price").asInt();
			
			System.out.println("how much shares you want to purchase .?");
			int no4 = sc.nextInt();
			
			System.out.println("Your Total Share Value Is  :--  "+(priceINFO * no4)+" as "+priceINFO+" Rs. per Share.");
			break;
			
		case 6 :
			JsonNode stck6 = stck.get(0);
			String stackName5 = stck6.path("Stack_Name").asText();
			int priceDr = stck6.path("Price").asInt();
			
			System.out.println("how much shares you want to purchase .?");
			int no5 = sc.nextInt();
			
			System.out.println("Your Total Share Value Is  :--  "+(priceDr * no5)+" as "+priceDr+" Rs. per Share.");
			break;
			
			default:
				System.out.println("You have entered  the wrong option.");
		}
	}
		catch(Exception e) {
			System.out.println("Error :- "+e);
		}
	}
	
	
}
