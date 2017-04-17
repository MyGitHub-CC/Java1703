package review.abstractDemo.UML;

public class NormalStudent extends Student{

	public NormalStudent() {
		super();
	}

	public NormalStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("NormalStudent showInfo()");
	}

	@Override
	public void study() {
		System.out.println("NormalStudent study()");
	}
	

}
