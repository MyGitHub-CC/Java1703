package day04;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("zhangsan");
		String name1 = student1.getName();
		System.out.println(name1);
		
		Student student2 = new Student();
		student2.setName("lisi");
		String name2 = student2.getName();
		System.out.println(name2);
	}
}
