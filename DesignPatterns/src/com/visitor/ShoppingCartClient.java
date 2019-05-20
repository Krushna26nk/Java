package com.visitor;

public class ShoppingCartClient {
	
	public static void main(String args[]) {
		ItemElement[] items = new ItemElement[]{
				new Book(20,"1234"),
				new Book(100,"5242"),
				new Fruit(10,2,"mango"),
				new Fruit(20,5,"Apple")};
		
		int total =calculatePrice(items);
		System.out.println("Total cost  => "+total);
	}
	
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImplementation();
		int sum=0;
		for(ItemElement item:items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
