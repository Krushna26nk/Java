package com.StructuralPatterns.Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testClass();
		testObject();
		
		
	}
	private static void testClass(){
		SocketAdapter socket = new SocketClassImplementation();
		
		Volt v3 = getVolt(socket,3);
		Volt v12 = getVolt(socket,12);
		Volt v120 = getVolt(socket,120);
		
		System.out.println(" 120 Volts using Adapter Class :- "+v120.getVolts());
		System.out.println(" 12 Volts using Adapter Class :- "+v12.getVolts());
		System.out.println(" 3 Volts using Adapter Class :- "+v3.getVolts());
		
		
	}
	private static void testObject(){
		SocketAdapter socket = new SocketObjectimplementation();
		
		Volt v3 = getVolt(socket,3);
		Volt v12 = getVolt(socket,12);
		Volt v120 = getVolt(socket,120);
		
		System.out.println(" 120 Volts using Adapter Object :- "+v120.getVolts());
		System.out.println(" 12 Volts using Adapter Object :- "+v12.getVolts());
		System.out.println(" 3 Volts using Adapter Object :- "+v3.getVolts());
		
	
	}
	private static Volt getVolt(SocketAdapter socket,int i) {
		switch(i) {
		case 3:
			return socket.get3Volt();
			
		case 12:
			return socket.get12Volt();
			
		case 120:
			return socket.get120Volt();
			
			default:
				return socket.get120Volt();
		
		}
	}

}
