package review.thread;

import org.junit.Test;

import day11.RunableThread;

public class ThreadDemo {
	public static void main(String[] args) {
		NumThread numThread1 = new NumThread("奇数线程： ", 1);
		numThread1.start();
		
		NumThread numThread2 = new NumThread("偶数线程： ", 2);
		numThread2.start();
	}
	
	@Test
	public void runThread() {
		RunableThread runableThread = new RunableThread(1);
		Thread thread = new Thread(runableThread);
		thread.start();
	}
}
