package day07.homework;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Bird("bird", 10);
//		animal.showInfo();
//		
//		animal = new Student("zhangsan", 20, "Java1703");
//		animal.showInfo();
//		System.out.println("---------------------------------");
//		
//		Person person = (Person) animal;
//		person.walk();
//		person.showInfo();
//		System.out.println("---------------------------------");
//		
//		Student student = (Student) animal;
//		student.showInfo();
//		student.walk();
//		student.study();
//		System.out.println("---------------------------------");
//		
//		Student student2 = (Student) person;
//		student2.study();
		
//		Student student = new Student();
//		student.study();
//		print(student);
		
//		Animal animal = new Student();
//		animal.showInfo();
//		Student stu2 = (Student) animal;
//		stu2.showInfo();
//		stu2.study();
		
		Student stu = (Student) new Animal();
		stu.showInfo();
		stu.study();
	}
	
	public static void print(Animal animal) {
		System.out.println(animal);
	}
}
