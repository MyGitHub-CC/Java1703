package day08.homework;

public class NormalTeacher extends Teacher{

	public NormalTeacher() {
		super();
	}

	public NormalTeacher(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void showInfo() {
		System.out.println("NormalTeacher showInfo(): " + "name: " + name + ", age: " + age);
	}

	@Override
	public void teach() {
		System.out.println("NormalTeacher teach() ");
	}
	
}
