package day11.productANDcustom;

import java.util.Random;

public class ProducterThread extends Thread {
	private Panzi panzi;

	public ProducterThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = new Cake("No." + i);
			System.out.println(Thread.currentThread().getName() + "putCake"	+ cake);
			panzi.putCake(cake);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
