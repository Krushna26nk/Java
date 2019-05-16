package com.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employees emp = new Employees();
		
		emp.loadData();
		
		// clone method to access the method object
		
		Employees empNew = (Employees)emp.clone();
		Employees empNew1 = (Employees)emp.clone();
		
		List<String> list = empNew.getEmpList();
		list.add("Ram");
		
		List<String> list1 = empNew1.getEmpList();
		list1.remove("Raj");
		
		System.out.println("Emp List :- "+emp.getEmpList());
		
		System.out.println("Emp New List :- "+list);
		
		System.out.println("Emp New 1 List :- "+list1);
		
		
	}

}
