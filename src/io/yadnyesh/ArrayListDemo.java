package io.yadnyesh;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		LinkedList l2 = new LinkedList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "M");
		l.add("N");
		System.out.println(l);

		
	}

}
