package day08.homework;

public abstract class Teacher extends AbstractPerson {

	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	public abstract void teach();
}
