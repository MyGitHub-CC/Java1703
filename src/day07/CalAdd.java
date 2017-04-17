package day07;

public class CalAdd extends Cal{

	public CalAdd() {
		super();
	}

	public CalAdd(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int getResult() {
		return num1 + num2;
	}
	
}
