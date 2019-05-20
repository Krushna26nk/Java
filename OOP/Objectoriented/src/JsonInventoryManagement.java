/*
 * Purpose:   Json Inventory Management
 *	@author: Krushna Nikam.
 */		


import java.io.IOException;
import java.io.StringWriter;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JsonInventoryManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// First Emp Object
		
		JSONObject obj1 = new JSONObject();
		
		obj1.put("Name", "Krushna");
		obj1.put("Last Name", "Nikam");
		obj1.put("Add", "Auranagabd");
		obj1.put("Company", "Cap");
		
		JSONObject firstEMP = new JSONObject();
		firstEMP.put("FirstEMP", obj1);

		// Second Emp Object
		
		JSONObject obj2 = new JSONObject();
		
		obj2.put("Name", "Prashant");
		obj2.put("Last Name", "Banage");
		obj2.put("Add", "Auranagabd");
		obj2.put("Company", "Capgemini");
		
		JSONObject secondEMP = new JSONObject();
		secondEMP.put("SecondEMP",obj2);
		
		// third EMP obj creation
		
		JSONObject obj3 = new JSONObject();
		
		obj3.put("Name", "Gopal");
		obj3.put("Last Name", "Kulkarni");
		obj3.put("Add", "jalna");
		obj3.put("Company", "Syntel");
		
		JSONObject thirdEMP = new JSONObject();
		thirdEMP.put("Third EMP", obj3);
		
		// json aaray for listing all data
		
		JSONArray jsonList = new JSONArray();
		
		jsonList.add(firstEMP);
		jsonList.add(secondEMP);
		jsonList.add(thirdEMP);
		
		try (FileWriter file = new FileWriter("empolyees.json")) {
			
			file.write(jsonList.toJSONString());
			file.flush();
			
		}
		catch(Exception e){
			System.out.println("Error :- " +e);
		}
//		JSONObject obj = new JSONObject();
//		obj.put("name","Krushna");
//		obj.put("Contact", "9028960981");
//		obj.put("Address","Aurangabad");
//		
//		StringWriter stringWrite = new StringWriter();
//		
//		obj.writeJSONString(stringWrite);
//		
//		String JsonText = stringWrite.toString();
//		System.out.print(JsonText);
	}

}
