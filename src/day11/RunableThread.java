package day11;

public class RunableThread implements Runnable{
	private int start;
	
	public RunableThread(int start) {
		this.start = start;
	}
	
	@Override
	public void run() {
		for (int i = start; i <= 100; i+=2) {
			System.out.println(i);
		}
	}

}
