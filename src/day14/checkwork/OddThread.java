package day14.checkwork;

public class OddThread extends Thread{
	private int start;
	
	public OddThread(int start) {
		this.start = start;
	}
	
	@Override
	public void run() {
		for (int i = start; i <= 100; i+=2) {
			System.out.println(i);
		}
	}
}
