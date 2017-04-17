package day07.homework;

public class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("Dog [name=" + name + ", age=" + age + "]");
	}

}
