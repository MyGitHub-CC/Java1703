package day05;

public class TestPerson {
	public static void main(String[] args) {
		Student student = new Student("张三", 20, '男', "三年级（2）班");
		student.eat();
		student.study();
		
		System.out.println("------------------------");
		
		Teacher teacher = new Teacher("王", 50, '女', 10000);
		teacher.eat();
		teacher.teach();
	}
}
