package day08;

public class Student extends Person {
	private String className;

	public Student() {
		super();
	}

	public Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	

	public void study() {
		System.out.println(age + "岁的" + name + "正在认真的学习！");
	}

	@Override
	public void showInfo() {
			System.out.println("Student [name=" + name + ", age=" + age
					+ ", className:" + className + "]");
	}
}
