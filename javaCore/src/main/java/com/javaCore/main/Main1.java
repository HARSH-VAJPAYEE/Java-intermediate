package com.javaCore.main;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.add(2, 50);
		
		
		System.out.println(list.get(1));
		
		/*
		 * for (Object object : list) {
		 * 
		 * int data = (int) object; System.out.println(data); }
		 */
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
