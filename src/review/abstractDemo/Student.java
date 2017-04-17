package review.abstractDemo;

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

	@Override
	public String toString() {
		return "Student [className=" + className + "]";
	}

	@Override
	public void showInfo() {
		System.out.println("Student showInfo()");
	}

	public void study() {
		System.out.println(className + "班的"  + age + "岁的" + name + "正在study()");
	}
}
