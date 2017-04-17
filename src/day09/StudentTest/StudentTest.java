package day09.StudentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// 1、创建一个学生数组
		List<Student> studentList = new ArrayList<Student>();
		// 2、输入所有学生的信息
		inputStudentInfos(studentList);
		// 3、打印所有学生的信息
		printAllStudentInfos(studentList);
		// 4、查询某个某个学生的信息
		searchStudentInfos(studentList);
	}

	public static void inputStudentInfos(List<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("录入完成请输入：0");
			System.out.println("按任意非“0”键继续输入");
			int k = scanner.nextInt();
			if (k == 0) {
				System.out.println("全部录入完成！");
				break;
			}
			System.out.println("请输入学生的姓名： ");
			String name = scanner.next();
			System.out.println("请输入学生的年龄： ");
			int age = scanner.nextInt();
			System.out.println("请输入学生的性别： ");
			char gender = scanner.next().charAt(0);
			System.out.println("请输入学生的成绩： ");
			int score = scanner.nextInt();
			Student student = new Student(name, age, gender, score);
			studentList.add(student);
		}
	}
	
	public static void printAllStudentInfos(List<Student> studentList) {
		for (Student stu : studentList) {
			System.out.println(stu);
		}
	}

	public static void searchStudentInfos(List<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入查询方式：");
			System.out.println("按照姓名查找请输入：1");
			System.out.println("按照年龄查找请输入：2");
			System.out.println("按照性别查找请输入：3");
			System.out.println("退出：0");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出成功！");
				break;
			}

			switch (type) {
			case 1:
				isSearchByNameFound(studentList);
				break;
			case 2:
				isSearchByAgeFound(studentList);
				break;
			case 3:
				isSearchByGenderFound(studentList);
				break;
			default:
				break;
			}
		}
	}

	public static void isSearchByNameFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean isSearchByNameFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (name.equals(studentList.get(i).getName())) {
				System.out.println(studentList.get(i));
				isSearchByNameFound = true;
			}
		}
		if (!isSearchByNameFound) {
			System.out.println("没有找到该学生！");
		}
	}

	public static void isSearchByAgeFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生年龄：");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		boolean isSearchByAgeFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (age == studentList.get(i).getAge()) {
				System.out.println(studentList.get(i));
				isSearchByAgeFound = true;
			}
		}
		if (!isSearchByAgeFound) {
			System.out.println("没有找到该学生！");
		}
	}

	public static void isSearchByGenderFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生性别：");
		Scanner scanner = new Scanner(System.in);
		char gender = scanner.next().charAt(0);
		boolean isSearchByGerderFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (gender == studentList.get(i).getGender()) {
				System.out.println(studentList.get(i));
				isSearchByGerderFound = true;
			}
		}
		if (!isSearchByGerderFound) {
			System.out.println("没有找到该学生！");
		}
	}

}
