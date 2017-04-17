package review.abstractDemo;

public class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("Dog showInfo()");
	}

}
