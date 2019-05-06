
/*
 * Purpose:   Hello <<name>>, We have your full name as <<full name>> in our system.
 *			 your contact number is 91-xxxxxxxxxx.Use RegularExpression to replace.
 *	@author: Krushna Nikam.
 */		

package org.json.simple;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RegularExpression {

	public static void RegExpression(String FirstName,String FullName,String Mobile) {
		
		String message = "   Hello <<Name>> , we have your full Name"
						+" as <<FullName>> in our System . \n  Your Contact Number is +91xxxxxxxxxx \n "
						+" Please Let us Know in case of any clarification.\n\t\t Thannk You..!\n\t\t BridgeLabz 01/02/2018 "	;
		// Creation of Regular Expression ..
		
		String RegExprName = "<<Name>>";
		String RegExprFullName = "<<FullName>>";
		String RegExprNum = "xxxxxxxxxx";
		String RegExprDate = "01/02/2018";
		
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
		
		// for getting system current date.
		Date date = new Date();
		String getDate = Date.format(date);
		
		// Replacing the by using regExpresion
		
		message = message.replaceAll(RegExprName, FirstName);
		message = message.replaceAll(RegExprFullName, FullName);
		message = message.replaceAll(RegExprNum, Mobile);
		message = message.replaceAll(RegExprDate, getDate);
		
		
		// Displaying the Modified Message.
		System.out.println(message);
				
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegExpression("Krushna","Krushna Chatru Nikam","9028960981");
		
	}

}
