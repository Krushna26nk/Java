import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonNode;

import java.io.File;

public class JsonParseTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/home/admin1/Desktop/Fellow/OOP/Objectoriented/stock.json");
		 
		String input = "{ \"id\":1, \"stock_Name\":\"TCS\",\"price\":1000},\n";
		
		ObjectMapper mapper = new ObjectMapper();

		try {

			JsonNode node = mapper.readTree(file);
			JsonNode stats = node.get("Stocks_Detail");				
			MainParser parser = mapper.readValue(file, MainParser.class);
			
			System.out.println(parser.getId());
			System.out.println(parser.getPrice());
			System.out.println(parser.getStock_Name());
			
		}
		catch(Exception e) {
			System.out.println("Error :- "+e);
		}
	}

}
