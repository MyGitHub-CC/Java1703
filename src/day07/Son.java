package day07;

public class Son extends Father{

	public Son() {
		super();
	}

	public Son(int num1) {
		super(num1);
	}
	
	public void display() {
		System.out.println(super.getNum1());
	}

}
