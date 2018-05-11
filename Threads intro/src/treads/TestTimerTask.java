package treads;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimerTask extends TimerTask {
	
	private Timer timer;
	
	public TestTimerTask(Timer timer) {
		super();
		this.timer = timer;
	}
	
	
	@Override
	public void run() {
		testTimerTask();
	}
	
	private synchronized void testTimerTask() {
		System.out.println();
		System.out.println("Hi.");
		System.out.println();
		/*Prekida tajmer za ovu konkretnu metodu*/
		timer.cancel();
		
		/*Gasi sve metode sto su prikacene za taj timer.
		timer.purge();*/
	}
	
	
}
