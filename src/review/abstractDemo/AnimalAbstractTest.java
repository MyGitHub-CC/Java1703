package review.abstractDemo;

public class AnimalAbstractTest {
	public static void main(String[] args) {
		Animal animal = new Student("zhangsan", 20, "Java 1703");
		animal.showInfo();
		System.out.println(animal.getName());
		
		System.out.println("=============");
		Person person = (Person) animal;
		person.walk();
		
		System.out.println("=============");
		Student student= (Student) animal;
		student.study();
		student.walk();
		
	}
}
