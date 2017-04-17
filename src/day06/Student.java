package day06;
/**
 * 定义学生Student类里面除了名字、年龄、性别外还有班级，特有的方法是学习。
 */
public class Student extends Person{
	String grade = "java";
	
	public void setGrade() {
		grade = "Java1703";
	}
	
	public void show() {
		System.out.println(grade + "班的" + super.name + "年龄是：" + super.age);
	}
	
	public void study() {
		System.out.println("学习");
	}
}
