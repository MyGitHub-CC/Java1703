package review.abstractDemo.UML;

public class AbstractPersonTest {
	public static void main(String[] args) {
		AbstractPerson abstractPerson = new SmokingStudent("zhangsan", 20);
		abstractPerson.showInfo();
		
		System.out.println("---------------------");
		
		SmokingStudent smokingStudent = (SmokingStudent) abstractPerson;
		smokingStudent.showInfo();
		smokingStudent.study();
		smokingStudent.smoke();
	}
}
