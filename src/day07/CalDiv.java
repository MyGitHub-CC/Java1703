package day07;

public class CalDiv extends Cal{

	public CalDiv() {
		super();
	}

	public CalDiv(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public int getResult() {
		return num1 / num2;
	}

}
