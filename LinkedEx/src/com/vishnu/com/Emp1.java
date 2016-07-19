package com.vishnu.com;

public class Emp1 {
	private String name;
	private int salary;
	public Emp1(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString(){
		return "name:"+this.name+"--salary--"+this.salary;}
}


