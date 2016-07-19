package com.vishnu.niit;

public class TestProduct {
	public static void main(String[] args) {

			Product p1= new Product("apple", "s1711");
			Product p2 = new Product("apple", "s1711", "white");
	
			
				System.out.println(p1.getUsername());
				System.out.println(p1.getId());
				System.out.println(p2.getUsername());
                System.out.println(p2.getId());
                System.out.println(p2.getColor());
}
}
