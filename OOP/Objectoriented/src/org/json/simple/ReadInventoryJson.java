package org.json.simple;

import java.io.FileReader;

import  java.io.IOException;
import java.util.Iterator;
import java.io.FileNotFoundException;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadInventoryJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JSON parser object to parse read file.
		JSONParser parser = new JSONParser();
		
		try(FileReader fileReader = new FileReader("inventory.json")) {
			
			// read the file using parser object.
			
			Object obj = parser.parse(fileReader);
			JSONArray empList = new JSONArray();
			empList.add(obj);
			
			System.out.println(empList);
			
			Iterator<String> itr = empList.iterator();
			while(itr.hasNext()) {
				JSONObject data = null;
				parseEmployeeObject((JSONObject)data);
			}
			// iterate over the array
			
//			empList.forEach(data -> parseEmployeeObject( (JSONObject) data));
			
		} catch (FileNotFoundException e) {
           System.out.println(e);
        } catch (IOException e) {
        	System.out.println(e);
        } catch (ParseException e) {
        	System.out.println(e);
        }
		
	}
	
	private static void parseEmployeeObject(JSONObject data) {
		
		// get employee object within list
		JSONObject empObject = (JSONObject) data.get("Rice");
		System.out.println();
		
		// get employee first name
		String firstName = (String) empObject.get("Rice Name");
		System.out.println(firstName);
		
		String lastName = (String) empObject.get("Price");
		System.out.println(lastName);
//		
//		String add = (String) empObject.get("Add");
//		System.out.println(add);
//		
		System.out.println();
		
		
	}

}
