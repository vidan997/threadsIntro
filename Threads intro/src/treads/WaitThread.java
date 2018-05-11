package treads;

public class WaitThread extends Thread {
	
	@Override
	public void run() {
		threadWait();
	}
	
	private synchronized void threadWait() {
		System.out.println("Wait 2s 5 times....");
		for (int i = 0; i < 5; i++) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(i + 1);
		}
		System.out.println("Done.");
	}
	
	
	
}
