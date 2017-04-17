package day08.homework;

public class AbstractPersonTest {
	public static void main(String[] args) {
		AbstractPerson abstractPerson = new NormalStudent("zhangsan", 22);
		abstractPerson.showInfo();
		Student student = (Student) abstractPerson;
		student.study();
		System.out.println("--------------------------");
		
		ISmoking smoking =  new SmokingTeacher("zhaoliu", 20);
		smoking.smoke();
		System.out.println("--------------------------");
		
		IBiking biking = new SmokingBikingTeacher("lisi", 25);
		biking.bike();
		
		ISmoking smoking2 =new SmokingBikingTeacher("wangwu", 18);
		smoking2.smoke();
	}
}
