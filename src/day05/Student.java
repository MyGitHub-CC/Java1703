package day05;
/**
 * 定义学生Student类里面除了名字、年龄、性别外还有班级，特有的方法是学习。
 */
public class Student extends Person{
	private String grade;

	public Student() {
		super();
	}

	public Student(String name, int age, char gender, String grade) {
		super(name, age, gender);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void study() {
		System.out.println(grade + "的" + super.getAge() + 
				"岁的" + super.getGender() + "同学"+ super.getName() + "在认真地学习。");
	}
}
