package review.abstractDemo.UML;

public abstract class Student extends AbstractPerson {

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public abstract void study();

}
