package day09.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> stulist = new ArrayList<Student>();
		while(true) {
			System.out.println("please intput:   0——exit;  !0——continue");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("exit!");
				break;
			}
			System.out.println("please input student name:");
			String name = scanner.next();
			System.out.println("please input student age:");
			int age = scanner.nextInt();
			System.out.println("please input student gender:");
			char gender = scanner.next().charAt(0);
			Student student = new Student(name, age, gender);
			stulist.add(student);
		}
		
		for(Student student : stulist) {
			System.out.println(student);
		}
		
		while (true) {
			System.out.println("please input search way: " +
					"'0'-exit; '1'-Search by name; '2'--Search by age; '3'--Search by gender");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("exit!");
				break;
			}
			switch (type) {
			case 1:
				System.out.println("please input want to search student name:");
				String name = scanner.next();
				boolean isSearchByName = false;
				for (Student student : stulist) {
					if (name.equals(student.getName())) {
						System.out.println(student);
						isSearchByName = true;
					}
				}
				if (!isSearchByName) {
					System.out.println("No search student!");
				}
				break;

			default:
				break;
			}
		}
	}
}
