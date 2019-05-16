package com.FactoryPattern;

public class FactoryTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","1 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","3.4 GHz");
		System.out.println(" PC Configuration:"+pc);
		System.out.println(" Server Configuration:"+server);
	}

}
