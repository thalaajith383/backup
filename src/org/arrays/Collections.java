package org.arrays;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(100);
		li.add(null);
		li.add(200);
		li.add(300);
		
		System.out.println(li);
		
		int is = li.size();
		System.out.println(is);
		
		li.add(4, 400);
		System.out.println(li);
		
		li.set(1, 10);
		System.out.println(li);
		
		int st = li.indexOf(400);
		System.out.println(st);
		
		
		int t1 = li.lastIndexOf(10);
		System.out.println(t1);
		
		
		int t2 = li.size();
		System.out.println(t2);
		
		System.out.println("\n\nfor loop");
		for (int i = 0; i < li.size(); i++) {
			Integer t3 = li.get(i);
			System.out.println(t3);
			
		}
		System.out.println("\n\n\nfor each loop");
		for (Integer t4 : li) {
			System.out.println(t4);
			
		}
		
	boolean b1 = li.isEmpty();
	System.out.println(b1);
		
	}

}
