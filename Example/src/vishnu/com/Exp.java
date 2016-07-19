package vishnu.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Exp {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		a1.add("c");
		a1.add("html");
		a1.add("sql");
		a1.add(".net");
		a1.add("oracle");
		System.out.println(a1);
		System.out.println("does this list contains vishnu"+a1.contains("vishnu"));
		a1.add(5,"vishnu");
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());	
		Iterator<String> i1=a1.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
	}

}
