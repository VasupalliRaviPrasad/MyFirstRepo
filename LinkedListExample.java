package com.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
//		LinkedList l = new LinkedList();
//		l.addFirst(1);
//		l.addFirst(2);
//		l.addFirst(3);
//		l.addFirst(4);
//		l.addLast(7);
//		l.addFirst(5);
//		l.addFirst(6);
//		
//		System.out.println(l);
//		System.out.println(l.getFirst() + " " + l.getLast());
//		System.out.println(l.removeFirst() + " " + l.removeLast());
//		System.out.println(l);
//		
//		
//		Vector<Object> v = new Vector<>();
//	for(int i =1; i<=10; i++) {	v.addElement(22);
//	
//	}
//		System.out.println(v);
//		System.out.println(v.capacity());
//		v.addElement(23);
//		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.size());
//		
//		for(Object n :v) {
//			System.out.print(n);
//		}
//		Object[] v1 = v.toArray();
//		System.out.println(Arrays.toString(v1));
//		
//		Vector v2 = new Vector(10, 30);
//		for(int i =1; i<=10; i++) {	v2.addElement(22 + i);
//		
//		}
//		System.out.println(v2);
//		System.out.println(v2.capacity());
//		v2.addElement(1);
//		System.out.println(v2);
//		System.out.println(v2.capacity());
//		System.out.println(v2.size());
		
		for(int i =1; i <=5; i++) {
			for(int k =i; k<=4; k++) {
				System.out.print(" ");
			}
			for(int j = i; j>=1; j --) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i =1; i <=5; i++) {
			for(int k =5-i; k<4; k++) {
				System.out.print(" ");
			}
			for(int j = i; j<=5; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
