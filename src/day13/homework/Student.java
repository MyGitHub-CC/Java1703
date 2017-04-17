package day13.homework;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	protected String name;
	protected int age;
	protected char gender;

	public Student() {
		super();
	}

	public Student(String name, int age, char gender) {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}

}
