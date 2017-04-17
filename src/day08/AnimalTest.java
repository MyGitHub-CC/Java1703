package day08;

public class AnimalTest {
	public static void main(String[] args) {
		// Cannot instantiate the type Animal
		// Animal animal = new Animal();
		
		Animal animal = new Student("zhangsan", 18, "Java1703");
		animal.showInfo();
		// Cannot instantiate the type Person
		// Animal animal2 = new Person();

		Student student = new Student("lisi", 18, "Java1703");
		student.showInfo();
		student.study();
	}
}
