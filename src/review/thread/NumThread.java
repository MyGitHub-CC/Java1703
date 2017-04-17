package review.thread;

public class NumThread extends Thread{
	private int start;
	
	public NumThread(String name, int start) {
		super(name);
		this.start = start;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		for (int i = start; i <= 100; i+=2) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
