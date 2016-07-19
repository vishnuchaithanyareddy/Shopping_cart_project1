package com.vishnu.com;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Emp1> list=new LinkedList<Emp1>();
		list.add(new Emp1("tim",20000));
		list.add(new Emp1("ram",25000));
		list.add(new Emp1("ramesh",30000));
		list.add(new Emp1("ravi",350000));
		list.add(new Emp1("raju",40000));
		list.add(new Emp1("uday",48000));
		Collections.sort(list, new MySalaryComp());
		System.out.println("sorted list");
		for(Emp1 e:list){
			System.out.println(e);
		}
	}

	

}