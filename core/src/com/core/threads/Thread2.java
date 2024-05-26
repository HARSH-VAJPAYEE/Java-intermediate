package com.core.threads;

public class Thread2 extends Thread {
	String threadName;
	public Thread2(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(threadName + " Hello "+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
