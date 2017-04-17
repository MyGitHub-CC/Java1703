package day08;

public class Bird extends Animal{
	

	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("Bird [name=" + name + ", age=" + age + "]");
	}
	
}
