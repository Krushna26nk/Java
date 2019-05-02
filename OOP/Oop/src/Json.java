import java.io.FileInputStream;
import java.io.FileOutputStream;

import  java.io.IOException;
import java.io.File;

public class Json {

	public static void getData(int c) {
		
		
		
	}
	
	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		FileInputStream inputStr = null;
		FileOutputStream outputStr = null;
		
		File path = new File( "/home/admin1/Desktop/Fellow/OOP/data.json");
		File path1 = new File( "/home/admin1/Desktop/Fellow/OOP/output.txt");
		
		try {
			
			inputStr = new FileInputStream(path);
			outputStr = new FileOutputStream(path1);
			
			inputStr.read();
			
			
			int c;
			while((c =inputStr.read()) != -1) {
				outputStr.write(c);
			}
//			System.out.println("Successfull.");
		}
		finally {
			
			if(inputStr != null) {
				inputStr.close();
			}
			if(outputStr !=null) {
				outputStr.close();
			}
		}
	}

}
