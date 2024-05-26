package com.core.threads;

public class Thread4 implements Runnable {
	String threadName;
	String sharedRe;
	public Thread4(String threadName, String sharedRe) {
		this.threadName = threadName;
		this.sharedRe = sharedRe;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				synchronized (sharedRe) {
					while(true) {
						System.out.println(threadName + " Hello "+ i);
						sharedRe.notifyAll();
						sharedRe.wait();
					}	
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
