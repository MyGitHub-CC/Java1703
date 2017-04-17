package day07;

public class CalMulti extends Cal{

	public CalMulti() {
		super();
	}

	public CalMulti(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public int getResult() {
		return num1 * num2;
	}
}
