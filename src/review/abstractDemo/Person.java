package review.abstractDemo;

public abstract class Person extends Animal{
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super(name, age);
	}

	public void walk() {
		System.out.println(age + "岁的" + name + "正在 walk()");
	}

}
