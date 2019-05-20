package com.StructuralPatterns.Proxy;

import java.io.IOException;

public class CommandExecutorimplementation implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws IOException{
	
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+ cmd + " ' command Executed.");
		
	}
	
}
	