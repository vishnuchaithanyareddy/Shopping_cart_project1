package com.niit.Cart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext();
	a.scan("com.niit.Cart");
	a.refresh();
	Product p=(Product) a.getBean("product");
	p.setId("5625");
	p.setName("vishnu");
	System.out.println(p.getName());
	System.out.println(p.getId());
	Category c=(Category)a.getBean("category");
	c.setDept("production");
	c.setSalary(250000.0);
	System.out.println(c.getDept());
	System.out.println(c.getSalary());
}
}
