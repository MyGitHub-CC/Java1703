package review.enumDemo;

public class Student {
	private String name;
	private int age;
	private EnumDemo gender;

	public Student() {
		super();
	}

	public Student(String name, int age, EnumDemo gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EnumDemo getGender() {
		return gender;
	}

	public void setGender(EnumDemo gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
