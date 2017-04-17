package day11.productANDcustom;

import java.util.LinkedList;

public class Panzi {
	private LinkedList<Cake> list = new LinkedList<Cake>();
	
	public synchronized Cake getCake() {
		if(list.size() <= 0) {
			System.out.println("Customer getCake wait");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = list.removeFirst();
		return cake;
	}
	
	public synchronized void putCake(Cake cake) {
		list.addLast(cake);
		notifyAll();
		System.out.println("Producter putCake notifyAll");
	}
}
