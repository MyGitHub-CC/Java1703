package day11.productANDcustom;

import java.util.Random;

public class CustomerThread extends Thread{
	private Panzi panzi;
	
	public CustomerThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = panzi.getCake();
			System.out.println(Thread.currentThread().getName() + "getCake" + cake);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
