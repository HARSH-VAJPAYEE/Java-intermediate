package com.core.threads;

public class Thread3 implements Runnable {
	String threadName;
	String sharedRe;
	public Thread3(String threadName, String sharedRe) {
		this.threadName = threadName;
		this.sharedRe = sharedRe;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				synchronized (sharedRe) {
					System.out.println(threadName + " Hello "+ i);
					if(i ==5) {
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
