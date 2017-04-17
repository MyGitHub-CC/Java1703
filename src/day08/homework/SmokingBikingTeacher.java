package day08.homework;

public class SmokingBikingTeacher extends Teacher implements ISmoking, IBiking {

	public SmokingBikingTeacher() {
		super();
	}

	public SmokingBikingTeacher(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void showInfo() {
		System.out.println("SmokingBikingTeacher showInfo(): " + "name: " + name + ", age: " + age);
	}
	
	@Override
	public void bike() {
		System.out.println("SmokingBikingTeacher bike()");
	}

	@Override
	public void smoke() {
		System.out.println("SmokingBikingTeacher smoke()");
	}

	@Override
	public void teach() {
		System.out.println("SmokingBikingTeacher teach() ");
	}

}
