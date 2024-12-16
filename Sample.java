package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Sample {
	
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(20);
		l.add(10);
		l.add(10);
		l.add(30);
		l.set(1, "Ravi");
		l.add(0, 11);
		
		System.out.println(l);
		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add("Ravi");
		System.out.println(s);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(200);
		lhs.add(300);
		lhs.add("Srinivas");
		lhs.add(5000);
		lhs.add(2001);
		lhs.add(3001);
		lhs.add(4100);
		lhs.add(50001);
		lhs.addAll(s);
		lhs.retainAll(s);
		System.out.println(lhs);
				
		
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.set(0, 11);
		l1.addAll(lhs);
		
		l1.addAll(0, s);
		System.out.println(l1.containsAll(l));
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		System.out.println(l1);
		System.out.println(l1.removeAll(s));
		
		Object[] obj = l1.toArray();
		for(Object object: obj) {
			System.out.print(object + " ");
		}
		
		l1.clear();
		System.out.println(l1.isEmpty());
		
		
	
	}

}
