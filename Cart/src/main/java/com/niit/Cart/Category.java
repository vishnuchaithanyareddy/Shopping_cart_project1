package com.niit.Cart;

import org.springframework.stereotype.Component;

@Component
public class Category {
private String dept;
private double salary;
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
