package day08.homework;

public class SmokingTeacher extends Teacher implements ISmoking {

	public SmokingTeacher() {
		super();
	}

	public SmokingTeacher(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void showInfo() {
		System.out.println("SmokingTeacher showInfo(): " + "name: " + name + ", age: " + age);
	}

	@Override
	public void smoke() {
		System.out.println("SmokingTeacher smoke()");
	}

	@Override
	public void teach() {
		System.out.println("SmokingTeacher teach() ");
	}

}
