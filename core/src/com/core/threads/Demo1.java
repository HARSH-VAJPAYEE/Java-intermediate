package com.core.threads;

public class Demo1 {

	public static void main(String[] args) {
//		
//		  Thread1 thread1 = new Thread1("Harsh"); thread1.start();
//		  
//		  Thread2 thread2 = new Thread2("Bhanu"); thread2.start();
//		 
		
	String status = new String("Pradeep");
		
		Thread thread3 = new Thread(new Thread3("Pradeep", status));
		thread3.start();
		
		Thread thread4 = new Thread(new Thread4("Pradeep Kumar", status));
		thread4.start();
		
		
	}
}
