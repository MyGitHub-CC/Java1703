package day05;
/**
 * 定义一个人Person类，里面有名字、年龄、性别，方法有吃饭。
 */
public class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person() {
		super();
	}

	public Person(String name, int age, char gender) {
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void eat() {
		System.out.println(age + "岁的" + gender +"生" + name + "在吃饭。");
	}
	
}
