package com.core.threads;

public class Thread1 extends Thread {
	String threadName;
	public Thread1(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
				System.out.println(threadName + " Hello "+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
