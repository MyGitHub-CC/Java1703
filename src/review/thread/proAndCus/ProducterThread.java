package review.thread.proAndCus;

import java.util.Random;

public class ProducterThread extends Thread{
	private Panzi panzi;
	
	public ProducterThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = new Cake("NO. " + i);
			System.out.println(Thread.currentThread().getName() + "putCake: " + cake);
			panzi.putCake(cake);
			try {
				Thread.sleep(new Random().nextInt(4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
