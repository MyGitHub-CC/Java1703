package review.thread.proAndCus;

public class MainTest {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		ProducterThread producterThread = new ProducterThread("生产蛋糕： ", panzi);
		producterThread.start();
		
		CustomerThread customerThread = new CustomerThread("消费蛋糕： ", panzi);
		customerThread.start();
	}
}
