package day11;

import org.junit.Test;

public class ThreadTest {
	public static void main(String[] args) {
//		System.out.println("start");
		NumThread thread1 = new NumThread("奇数线程", 1);
		thread1.start();
		
		NumThread thread2 = new NumThread("偶数线程", 2);
		thread2.start();
		
//		thread.run();
//		System.out.println("end");
//		for (int i = 0; i < 20; i++) {
//			System.out.println(100);
//		}
	}
	
	
	@Test
	public void test1() {
		RunableThread runableThread = new RunableThread(1);
		Thread thread = new Thread(runableThread);
		thread.start();
	}
	
	@Test
	public void test2() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("hhhhh");
	}
}
