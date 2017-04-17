package day08.homework;

public class SmokingStudent extends Student implements ISmoking {

	public SmokingStudent() {
		super();
	}

	public SmokingStudent(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void showInfo() {
		System.out.println("SmokingStudent showInfo(): " + "name: " + name + ", age: " + age);
	}

	@Override
	public void smoke() {
		System.out.println("SmokingStudent smoke()");
	}

	@Override
	public void study() {
		System.out.println("SmokingStudent study()");
	}

}
