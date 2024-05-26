package com.core;

import com.core.service.Item;

public class Main1 {
	public static void main(String[] args) {
		Item item = Item.getItem();
		Item item1 =  Item.getItem();
		Item item2 =  Item.getItem();
		Item item3 =  Item.getItem();
		

		System.out.println(item.hashCode());
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());
		System.out.println(item3.hashCode());
	}
}
