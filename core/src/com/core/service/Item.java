package com.core.service;

public class Item {

	private static Item item = null;
	
	private Item() {
		
	}
	
	public static Item getItem() {
		if(item == null) {
			item = new Item();
		}
		return item;
	}
}
