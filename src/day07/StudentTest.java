package day07;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("zhangsan", 20, '男');
		System.out.println(student1);
		
		Student student2 = new Student("zhangsan", 20, '男');
		System.out.println(student2);
		
		System.out.println("--------------------------");
		
		System.out.println(Student.getCountry());
		
	}
}
