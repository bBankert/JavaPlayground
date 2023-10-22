package com.bbankert.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		List<String> list2 = new ArrayList<>();
		
		list1.add("Some string");
		list1.add(1);
		
		Object obj = list1.get(1);
		System.out.println(obj);
		
		list2.add("some string");
		
		String str = list2.get(0);
		System.out.println(str);
		
		list2 = new LinkedList<>();
		list2.add("another string");
		System.out.println(list2.get(0));
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(list3.get(1));
		
		System.out.println(list3);
		
		for(Integer i: list3) {
			System.out.println(i);
		}
		
		list3.clear();
		System.out.println(list3);

	}

}
