package day08.homework;

public class NormalStudent extends Student {

	public NormalStudent() {
		super();
	}

	public NormalStudent(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void showInfo() {
		System.out.println("NormalStudent showInfo(): " + "name: " + name + ", age: " + age);
	}

	@Override
	public void study() {
		System.out.println("NormalStudent study()");
	}
}
