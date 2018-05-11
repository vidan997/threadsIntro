package test;

import java.util.Timer;

import treads.TestTimerTask;
import treads.WaitThread;

public class Test {
	
	public void simpleDelay() {
		System.out.println("Wait 2s....");
		long l1 = System.currentTimeMillis();
		while(System.currentTimeMillis() < (l1 + 2000)) {
		}
		System.out.println("Done.");
	}
	
	public synchronized void waitDelay() {
		System.out.println("Wait 2s....");
		try {
			wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");
	}
	
	public synchronized void loopDelay() {
		System.out.println("Wait 2s 5 times....");
		for (int i = 0; i < 5; i++) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println(i + 1);
		}
		System.out.println("Done.");
	}
	public void testThreadWait() {
		WaitThread w = new WaitThread();
		w.start();
		System.out.println("Trivial...");
	}
	
	public synchronized void testTimer(){
		Timer timer = new Timer();
		TestTimerTask tt = new TestTimerTask(timer);
		timer.schedule(tt, 2500);
		System.out.println("Wait 2s 5 times....");
		for (int i = 0; i < 5; i++) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println(i + 1);
		}
		System.out.println("Done.");
	}
}
