package com.StructuralPatterns.Proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user,String pwd) {
		if(("krushna").equals(user) && ("1234").equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorimplementation();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin) {
			executor.runCommand(cmd);
		}
		else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("command starts with rm is not allowed for non admin user.");
			}
			else {
				executor.runCommand(cmd);
			}
		}
	}
	
}
