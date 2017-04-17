package review.enumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		while (true) {
			System.out.println("请输入学生的姓名：");
			String name = scanner.next();
			System.out.println("请输入学生的年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生的性别：0-男, 1-女");
			int genderType = scanner.nextInt();
			EnumDemo enumGender = null;
			if (genderType == 0) {
				enumGender = EnumDemo.MALE;
			} else if (genderType == 1) {
				enumGender = EnumDemo.FEMALE;
			}
			Student studentInfo = new Student(name, age, enumGender);
			list.add(studentInfo);

			System.out.println("是否继续输入：0-继续， 1- 退出");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出成功！");
				break;
			}
		}

		printStudentInfos(list);

	}

	public static void printStudentInfos(List<Student> list) {
		for (Student student : list) {
			if (student.getGender() == EnumDemo.MALE) {
				System.out.println(student.getName() + "是"
						+ student.getGender().getValue() + "生需要打扫卫生。");
			} else if (student.getGender() == EnumDemo.FEMALE) {
				System.out.println(student.getName() + "是"
						+ student.getGender().getValue() + "生需要打扫卫生。");
			}
		}
	}
}
