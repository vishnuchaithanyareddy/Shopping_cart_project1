package com.niit;

public class Employee {
	private String name;
	private int id;
	Employee emp;
	Department dpt;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	public static void main(String[] args) {
		Employee manager=new Employee("vishnu",1744);
		Employee clerk=new Employee("munna",170);
		clerk.setEmp(manager);
		Department dt=new Department("ece",12);
		clerk.setDpt(dt);
		display(clerk);
		
	}
	private static void display(Employee clerk) {
		System.out.println(clerk.getName());
		System.out.println(clerk.getId());
		System.out.println(clerk.getEmp().getName());
		System.out.println(clerk.getEmp().getId());
		System.out.println(clerk.getDpt().getName());
		System.out.println(clerk.getDpt().getId());
		
	}
	

}
