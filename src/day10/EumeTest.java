package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EumeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> stulist = new ArrayList<Student>();
		while (true) {
			System.out.println("please input student name:");
			String name = scanner.next();
			System.out.println("please input student age:");
			int age = scanner.nextInt();
			System.out.println("please input student gender:0-male; 1-female");
			int genderType = scanner.nextInt();
			EnumGender gender = null;
			if (genderType == 0) {
				gender = EnumGender.MALE;
			} else if (genderType == 1) {
				gender = EnumGender.FEMALE;
			}
			Student student = new Student(name, age, gender);
			stulist.add(student);
			System.out.println("please intput:   0——exit;  !0——continue");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("exit!");
				break;
			}
		}
		printStudentsInfos(stulist);
	}

	public static void printStudentsInfos(List<Student> list) {
		for (Student student : list) {
			// System.out.println(student);
			if (student.getGender() == EnumGender.MALE) {
				System.out.println(student.getName() + "是" + 
						student.getGender().getValue() + "生需要打扫卫生！");
			} else if (student.getGender() == EnumGender.FEMALE) {
				System.out.println(student.getName() + "是" + 
						student.getGender().getValue() + "生需要打扫卫生！");
			}
		}
	}
	
}
