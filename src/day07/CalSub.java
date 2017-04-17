package day07;

public class CalSub extends Cal{

	public CalSub() {
		super();
	}

	public CalSub(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public int getResult() {
		return num1 - num2;
	}
}
