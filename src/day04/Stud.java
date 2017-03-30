package day04;

public class Stud {
	private String name;
	private  int age;
	private  char gender;
	private  int score;
	
	public Stud() {
		
	}
	
	public Stud(String name, int age, char gender, int score) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
