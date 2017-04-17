package review.abstractDemo.UML;

public abstract class AbstractPerson {
	protected String name;
	protected int age;

	public AbstractPerson() {
		super();
	}

	public AbstractPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void showInfo();

}
