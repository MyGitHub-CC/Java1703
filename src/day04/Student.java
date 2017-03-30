package day04;


public class Student {
	// 成员变量
	private String name;
	private int age;
	private char gender;
	
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
	
	
	
	
	
	/*public void setName(String name) {
		// 就近原则
		// The assignment to variable name has no effect
		// this 当前类Student的对象
		// student.name = name (String name)
		// student2.name = name (String name)
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}*/
}
