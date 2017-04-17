package day07.homework;

public class Person extends Animal {

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("Person [name=" + name + ", age=" + age + "]");
	}

	public void walk() {
		System.out.println(age + "岁的" + name + "正在散步！");
	}
}
