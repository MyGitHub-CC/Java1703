package day07.homework;

public class OfficeTest {
	public static void main(String[] args) {
		Office office = new Word("123");
		office.start();
		
		office = new Excel("123");
		office.start();
	}
}
