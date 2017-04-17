package review.abstractDemo;

public class Bird extends Animal {

	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("Bird showInfo()");
	}

}
