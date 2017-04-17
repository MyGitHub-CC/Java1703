package day06;

import org.junit.Test;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Student();
		person.name = "zhangsan";
		person.age = 20;
		
		person.show();
		
		Student student = new Student(); 
		student.name = "lisi";
		student.age = 18;
		student.show();
	}
	
	@Test
	public void testMethod() {
//		Student student = new Student(); 
//		student.name = "zhangsan";
//		student.age = 18;
//		printStudent(student);
		
//		Teacher teacher = new Teacher();
//		teacher.name = "lisi";
//		teacher.age = 33;
//		printTeacher(teacher);
//		
//		Person person = new Teacher();
//		person.name = "lisi";
//		person.age = 33;
//		Teacher teacher = (Teacher)person;
//		print(person);
		
//		Person person = new Person();
//		person.name = "lisi";
//		person.age = 33;
//		printTeacher(person);
		
//		System.out.println("----------------");
//		print(student);
//		print(teacher);
	}
	
	public void print(Person person) {
		System.out.println(person.name);
		System.out.println(person.age);
	}
	public void printStudent(Student student) {
		System.out.println(student.name);
		System.out.println(student.age);
	}
	public void printTeacher(Teacher teacher) {
		System.out.println(teacher.name);
		System.out.println(teacher.age);
	}
}
