package com.vishnu;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<List> l1 = new ArrayList<List>();
		List p0 = new List("vishnu", "s1711", "white", "12", 25000);
		l1.add(p0);
		List p1 = new List("vishnu", "s1711", "white", "12", 25000);
		l1.add(p1);
		List p2 = new List("vishnu", "s1711", "white", "12", 25000);
		l1.add(p2);
		List p3 = new List("vishnu", "s1711", "white", "12", 25000);
		l1.add(p3);
		for (List l2 : l1) {
			System.out.println(l2.getUsername());
			System.out.println(l2.getId());
			System.out.println(l2.getColor());
			System.out.println(l2.getSize());
			System.out.println(l2.getPrice());

		}

	}

}
