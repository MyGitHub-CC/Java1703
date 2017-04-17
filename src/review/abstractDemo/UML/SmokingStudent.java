package review.abstractDemo.UML;

public class SmokingStudent extends Student implements ISmoking{

	public SmokingStudent() {
		super();
	}

	public SmokingStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println(age + "岁的" + name + "showInfo()");
	}

	@Override
	public void smoke() {
		System.out.println(age + "岁的" + name + "smoke()");
	}

	@Override
	public void study() {
		System.out.println(age + "岁的" + name + "study()");
	}
	
}
